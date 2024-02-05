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
package com.tencentcloudapi.car.v20220110;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.car.v20220110.models.*;

public class CarClient extends AbstractClient{
    private static String endpoint = "car.tencentcloudapi.com";
    private static String service = "car";
    private static String version = "2022-01-10";
    
    public CarClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CarClient(Credential credential, String region, ClientProfile profile) {
        super(CarClient.endpoint, CarClient.version, credential, region, profile);
    }

    /**
     *This API is used to request a concurrency. The timeout period of the API is 20 seconds.
     * @param req ApplyConcurrentRequest
     * @return ApplyConcurrentResponse
     * @throws TencentCloudSDKException
     */
    public ApplyConcurrentResponse ApplyConcurrent(ApplyConcurrentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyConcurrent", ApplyConcurrentResponse.class);
    }

    /**
     *This API is used to create a session. The timeout period of the API is 5 seconds.
     * @param req CreateSessionRequest
     * @return CreateSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateSessionResponse CreateSession(CreateSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSession", CreateSessionResponse.class);
    }

    /**
     *Obtain the concurrency count.
     * @param req DescribeConcurrentCountRequest
     * @return DescribeConcurrentCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConcurrentCountResponse DescribeConcurrentCount(DescribeConcurrentCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConcurrentCount", DescribeConcurrentCountResponse.class);
    }

    /**
     *Terminate the session. If stream push has been initiated in this session, then the stream push will end upon session termination.
     * @param req DestroySessionRequest
     * @return DestroySessionResponse
     * @throws TencentCloudSDKException
     */
    public DestroySessionResponse DestroySession(DestroySessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroySession", DestroySessionResponse.class);
    }

    /**
     *Initiate stream push. The codec for the stream push is automatically adjusted based on the client's (SDK) capabilities, with a default order of H265, H264, VP8, and VP9.
     * @param req StartPublishStreamRequest
     * @return StartPublishStreamResponse
     * @throws TencentCloudSDKException
     */
    public StartPublishStreamResponse StartPublishStream(StartPublishStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartPublishStream", StartPublishStreamResponse.class);
    }

    /**
     *Initiate stream push to the specified URL. The codec for the stream push is automatically adjusted based on the client's (SDK) capabilities, with a default order of H265, H264, VP8, and VP9. This stream push method will be charged separately. For details about the charging method, see [Charging for Stream Push to Specified URL](https://intl.cloud.tencent.com/document/product/1547/72168?from_cn_redirect=1#98ac188a-d122-4caf-88be-05268ecefdf6).
     * @param req StartPublishStreamWithURLRequest
     * @return StartPublishStreamWithURLResponse
     * @throws TencentCloudSDKException
     */
    public StartPublishStreamWithURLResponse StartPublishStreamWithURL(StartPublishStreamWithURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartPublishStreamWithURL", StartPublishStreamWithURLResponse.class);
    }

    /**
     *This API is used to stop stream push.
     * @param req StopPublishStreamRequest
     * @return StopPublishStreamResponse
     * @throws TencentCloudSDKException
     */
    public StopPublishStreamResponse StopPublishStream(StopPublishStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopPublishStream", StopPublishStreamResponse.class);
    }

}
