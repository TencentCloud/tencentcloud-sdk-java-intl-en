/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cloudaudit.v20190319;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cloudaudit.v20190319.models.*;

public class CloudauditClient extends AbstractClient{
    private static String endpoint = "cloudaudit.tencentcloudapi.com";
    private static String service = "cloudaudit";
    private static String version = "2019-03-19";

    public CloudauditClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CloudauditClient(Credential credential, String region, ClientProfile profile) {
        super(CloudauditClient.endpoint, CloudauditClient.version, credential, region, profile);
    }

    /**
     *This API is used to create resource recorders to detect and record resource configuration changes.
     * @param req CreateRecorderRequest
     * @return CreateRecorderResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecorderResponse CreateRecorder(CreateRecorderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRecorderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRecorderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRecorder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete resource recorders. After deletion, resource configuration changes will not be recorded.
     * @param req DeleteRecorderRequest
     * @return DeleteRecorderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecorderResponse DeleteRecorder(DeleteRecorderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecorderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecorderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecorder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to view the basic information of discovered resources.
     * @param req DescribeDiscoveredResourceRequest
     * @return DescribeDiscoveredResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiscoveredResourceResponse DescribeDiscoveredResource(DescribeDiscoveredResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiscoveredResourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiscoveredResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiscoveredResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to display current configurations and status of a recorder.
     * @param req DescribeRecorderRequest
     * @return DescribeRecorderResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecorderResponse DescribeRecorder(DescribeRecorderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecorderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecorderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecorder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get the list of resource configuration items and display resource configuration changes in chronological order.
     * @param req GetConfigurationItemsRequest
     * @return GetConfigurationItemsResponse
     * @throws TencentCloudSDKException
     */
    public GetConfigurationItemsResponse GetConfigurationItems(GetConfigurationItemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetConfigurationItemsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetConfigurationItemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetConfigurationItems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to view the list of discovered resources.
     * @param req ListDiscoveredResourcesRequest
     * @return ListDiscoveredResourcesResponse
     * @throws TencentCloudSDKException
     */
    public ListDiscoveredResourcesResponse ListDiscoveredResources(ListDiscoveredResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListDiscoveredResourcesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListDiscoveredResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListDiscoveredResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of all CFA supported resource types.
     * @param req ListSupportResourceTypesRequest
     * @return ListSupportResourceTypesResponse
     * @throws TencentCloudSDKException
     */
    public ListSupportResourceTypesResponse ListSupportResourceTypes(ListSupportResourceTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListSupportResourceTypesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListSupportResourceTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListSupportResourceTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the resources to monitor, recorder name, and other recorder configurations.
     * @param req UpdateRecorderRequest
     * @return UpdateRecorderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecorderResponse UpdateRecorder(UpdateRecorderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRecorderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRecorderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateRecorder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
