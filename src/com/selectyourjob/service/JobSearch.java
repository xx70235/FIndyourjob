package com.selectyourjob.service;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.selectyourjob.models.ResultModel;
import com.selectyourjob.models.SearchParasModel;
import com.selectyourjob.utils.XmlUtil;

public class JobSearch {

	String userParas= null;
	String targetUrl=null;
	public List<ResultModel>  search(SearchParasModel spm)
	{
		userParas = GetUserParam.getUSerParam();
		generateUrl(spm);
		String responseBody=null;
		CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet(targetUrl);

            System.out.println("Executing request " + httpget.getRequestLine());

            // Create a custom response handler
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

                public String handleResponse(
                        final HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }

            };
            responseBody = httpclient.execute(httpget, responseHandler);
        } catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            try {
				httpclient.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        List<ResultModel> resultModels = XmlUtil.resultParser(responseBody);
        return resultModels;
	}
	
	void generateUrl(SearchParasModel spm)
	{
		if(userParas!=null && userParas.length()>0)
		{
			String[] tmps = userParas.split("###");
			if(tmps.length==2)
			{
				spm.setUseragent(tmps[0]);
				spm.setUserip(tmps[1]);
			}
			else
			{
				spm.setUseragent("Mozilla/%2F4.0%28Firefox%29");
				spm.setUserip("1.2.3.4");
			}
		}
		else
		{
			spm.setUseragent("Mozilla/%2F4.0%28Firefox%29");
			spm.setUserip("1.2.3.4");
		}
		targetUrl =spm.generateUrl();
		
	}
}
