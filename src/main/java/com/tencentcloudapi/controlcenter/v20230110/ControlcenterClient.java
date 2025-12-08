/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.controlcenter.v20230110;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.controlcenter.v20230110.models.*;

public class ControlcenterClient extends AbstractClient{
    private static String endpoint = "controlcenter.intl.tencentcloudapi.com";
    private static String service = "controlcenter";
    private static String version = "2023-01-10";

    public ControlcenterClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ControlcenterClient(Credential credential, String region, ClientProfile profile) {
        super(ControlcenterClient.endpoint, ControlcenterClient.version, credential, region, profile);
    }

    /**
     *This API is used to apply baselines to existing accounts in batches.
     * @param req BatchApplyAccountBaselinesRequest
     * @return BatchApplyAccountBaselinesResponse
     * @throws TencentCloudSDKException
     */
    public BatchApplyAccountBaselinesResponse BatchApplyAccountBaselines(BatchApplyAccountBaselinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchApplyAccountBaselines", BatchApplyAccountBaselinesResponse.class);
    }

    /**
     *This API is used to retrieve user baseline configuration data.
     * @param req GetAccountFactoryBaselineRequest
     * @return GetAccountFactoryBaselineResponse
     * @throws TencentCloudSDKException
     */
    public GetAccountFactoryBaselineResponse GetAccountFactoryBaseline(GetAccountFactoryBaselineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAccountFactoryBaseline", GetAccountFactoryBaselineResponse.class);
    }

    /**
     *This API is used to obtain account factory system baseline items.
     * @param req ListAccountFactoryBaselineItemsRequest
     * @return ListAccountFactoryBaselineItemsResponse
     * @throws TencentCloudSDKException
     */
    public ListAccountFactoryBaselineItemsResponse ListAccountFactoryBaselineItems(ListAccountFactoryBaselineItemsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAccountFactoryBaselineItems", ListAccountFactoryBaselineItemsResponse.class);
    }

    /**
     *This API is used to retrieve the application history of a certain baseline item.
     * @param req ListDeployStepTasksRequest
     * @return ListDeployStepTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListDeployStepTasksResponse ListDeployStepTasks(ListDeployStepTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDeployStepTasks", ListDeployStepTasksResponse.class);
    }

    /**
     *This API is used to update the current baseline item configuration of a user. The baseline configuration will be overwritten with the current configuration. When adding new baseline items, the newly-added baseline configuration needs to be added to the existing configuration. When deleting baseline items, the deleted baseline configuration needs to be removed from the existing configuration, then save the latest baseline configuration.
     * @param req UpdateAccountFactoryBaselineRequest
     * @return UpdateAccountFactoryBaselineResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAccountFactoryBaselineResponse UpdateAccountFactoryBaseline(UpdateAccountFactoryBaselineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAccountFactoryBaseline", UpdateAccountFactoryBaselineResponse.class);
    }

}
