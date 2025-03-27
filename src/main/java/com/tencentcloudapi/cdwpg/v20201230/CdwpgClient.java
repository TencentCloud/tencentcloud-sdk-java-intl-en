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
package com.tencentcloudapi.cdwpg.v20201230;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdwpg.v20201230.models.*;

public class CdwpgClient extends AbstractClient{
    private static String endpoint = "cdwpg.intl.tencentcloudapi.com";
    private static String service = "cdwpg";
    private static String version = "2020-12-30";
    
    public CdwpgClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdwpgClient(Credential credential, String region, ClientProfile profile) {
        super(CdwpgClient.endpoint, CdwpgClient.version, credential, region, profile);
    }

    /**
     *This API is used to create  instance
     * @param req CreateInstanceByApiRequest
     * @return CreateInstanceByApiResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceByApiResponse CreateInstanceByApi(CreateInstanceByApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstanceByApi", CreateInstanceByApiResponse.class);
    }

    /**
     *This API is used to query the instance information by an instance ID.
     * @param req DescribeInstanceRequest
     * @return DescribeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceResponse DescribeInstance(DescribeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstance", DescribeInstanceResponse.class);
    }

    /**
     *This API is used to get instance information.
     * @param req DescribeInstanceInfoRequest
     * @return DescribeInstanceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceInfoResponse DescribeInstanceInfo(DescribeInstanceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceInfo", DescribeInstanceInfoResponse.class);
    }

    /**
     *This API is used to display instance status, process progress, etc., in the instance details page.
     * @param req DescribeInstanceStateRequest
     * @return DescribeInstanceStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceStateResponse DescribeInstanceState(DescribeInstanceStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceState", DescribeInstanceStateResponse.class);
    }

    /**
     *This API is used to get a list of  instances.
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *This API is used to get a list of instance
     * @param req DescribeSimpleInstancesRequest
     * @return DescribeSimpleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSimpleInstancesResponse DescribeSimpleInstances(DescribeSimpleInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSimpleInstances", DescribeSimpleInstancesResponse.class);
    }

    /**
     *This API is used to destroy instance.
     * @param req DestroyInstanceByApiRequest
     * @return DestroyInstanceByApiResponse
     * @throws TencentCloudSDKException
     */
    public DestroyInstanceByApiResponse DestroyInstanceByApi(DestroyInstanceByApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyInstanceByApi", DestroyInstanceByApiResponse.class);
    }

    /**
     *This API is used to modify instance information. Only the name of an instance can be modified currently.
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

}
