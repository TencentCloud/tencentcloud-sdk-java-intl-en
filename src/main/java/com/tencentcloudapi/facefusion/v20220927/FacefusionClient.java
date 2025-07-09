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
package com.tencentcloudapi.facefusion.v20220927;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.facefusion.v20220927.models.*;

public class FacefusionClient extends AbstractClient{
    private static String endpoint = "facefusion.intl.tencentcloudapi.com";
    private static String service = "facefusion";
    private static String version = "2022-09-27";

    public FacefusionClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public FacefusionClient(Credential credential, String region, ClientProfile profile) {
        super(FacefusionClient.endpoint, FacefusionClient.version, credential, region, profile);
    }

    /**
     *This API is used to perform the fusion of a single face, multiple faces, and specified faces with the material template by uploading face images. Users can add logos to generated images. See <a href="https://intl.cloud.tencent.com/document/product/670/38247?from_cn_redirect=1" target="_blank">Fusion Access Guide</a>.



- The signature method in the public parameters must be specified as the V3 version. In other words, set the SignatureMethod parameter to TC3-HMAC-SHA256.
     * @param req FuseFaceRequest
     * @return FuseFaceResponse
     * @throws TencentCloudSDKException
     */
    public FuseFaceResponse FuseFace(FuseFaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FuseFace", FuseFaceResponse.class);
    }

    /**
     *This API is used to query the progress and status of video face fusion tasks by Job ID.
     * @param req QueryVideoFaceFusionJobRequest
     * @return QueryVideoFaceFusionJobResponse
     * @throws TencentCloudSDKException
     */
    public QueryVideoFaceFusionJobResponse QueryVideoFaceFusionJob(QueryVideoFaceFusionJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryVideoFaceFusionJob", QueryVideoFaceFusionJobResponse.class);
    }

    /**
     *This API is used to submit asynchronous processing tasks of video face fusion. After a task is submitted, the Job ID, estimated completion time, and current queue length will be returned.
     * @param req SubmitVideoFaceFusionJobRequest
     * @return SubmitVideoFaceFusionJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitVideoFaceFusionJobResponse SubmitVideoFaceFusionJob(SubmitVideoFaceFusionJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitVideoFaceFusionJob", SubmitVideoFaceFusionJobResponse.class);
    }

}
