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
     *This API is used to request concurrency quota. The timeout period of the API is 20 seconds.
     * @param req ApplyConcurrentRequest
     * @return ApplyConcurrentResponse
     * @throws TencentCloudSDKException
     */
    public ApplyConcurrentResponse ApplyConcurrent(ApplyConcurrentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyConcurrent", ApplyConcurrentResponse.class);
    }

    /**
     *This API is used to create an application.
     * @param req CreateApplicationRequest
     * @return CreateApplicationResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationResponse CreateApplication(CreateApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplication", CreateApplicationResponse.class);
    }

    /**
     *This API is used to create a cloud application version snapshot.
     * @param req CreateApplicationSnapshotRequest
     * @return CreateApplicationSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationSnapshotResponse CreateApplicationSnapshot(CreateApplicationSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationSnapshot", CreateApplicationSnapshotResponse.class);
    }

    /**
     *This API is used to create a cloud application version.
     * @param req CreateApplicationVersionRequest
     * @return CreateApplicationVersionResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationVersionResponse CreateApplicationVersion(CreateApplicationVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationVersion", CreateApplicationVersionResponse.class);
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
     *This API is used to delete a cloud application.
     * @param req DeleteApplicationRequest
     * @return DeleteApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationResponse DeleteApplication(DeleteApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplication", DeleteApplicationResponse.class);
    }

    /**
     *This API is used to delete a cloud application version.
     * @param req DeleteApplicationVersionRequest
     * @return DeleteApplicationVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationVersionResponse DeleteApplicationVersion(DeleteApplicationVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplicationVersion", DeleteApplicationVersionResponse.class);
    }

    /**
     *This API is used to query application file information.
     * @param req DescribeApplicationFileInfoRequest
     * @return DescribeApplicationFileInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationFileInfoResponse DescribeApplicationFileInfo(DescribeApplicationFileInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationFileInfo", DescribeApplicationFileInfoResponse.class);
    }

    /**
     *This API is used to query the cloud application list.
     * @param req DescribeApplicationListRequest
     * @return DescribeApplicationListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationListResponse DescribeApplicationList(DescribeApplicationListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationList", DescribeApplicationListResponse.class);
    }

    /**
     *This API is used to query the cloud application startup path list.
     * @param req DescribeApplicationPathListRequest
     * @return DescribeApplicationPathListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationPathListResponse DescribeApplicationPathList(DescribeApplicationPathListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationPathList", DescribeApplicationPathListResponse.class);
    }

    /**
     *This API is used to query the running status of a cloud application and update status information.
     * @param req DescribeApplicationStatusRequest
     * @return DescribeApplicationStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationStatusResponse DescribeApplicationStatus(DescribeApplicationStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationStatus", DescribeApplicationStatusResponse.class);
    }

    /**
     *This API is used to query the version information of a cloud application.
     * @param req DescribeApplicationVersionRequest
     * @return DescribeApplicationVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationVersionResponse DescribeApplicationVersion(DescribeApplicationVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationVersion", DescribeApplicationVersionResponse.class);
    }

    /**
     *This API is used to obtain the concurrency count.
     * @param req DescribeConcurrentCountRequest
     * @return DescribeConcurrentCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConcurrentCountResponse DescribeConcurrentCount(DescribeConcurrentCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConcurrentCount", DescribeConcurrentCountResponse.class);
    }

    /**
     *This API is used to query COS key information.
     * @param req DescribeCosCredentialRequest
     * @return DescribeCosCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosCredentialResponse DescribeCosCredential(DescribeCosCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosCredential", DescribeCosCredentialResponse.class);
    }

    /**
     *This API is used to terminate a session. If cloud-based streaming has been enabled for this session, the cloud-based streaming will end upon session termination.
     * @param req DestroySessionRequest
     * @return DestroySessionResponse
     * @throws TencentCloudSDKException
     */
    public DestroySessionResponse DestroySession(DestroySessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroySession", DestroySessionResponse.class);
    }

    /**
     *This API is used to modify basic information of a cloud application.
     * @param req ModifyApplicationBaseInfoRequest
     * @return ModifyApplicationBaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationBaseInfoResponse ModifyApplicationBaseInfo(ModifyApplicationBaseInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationBaseInfo", ModifyApplicationBaseInfoResponse.class);
    }

    /**
     *This API is used to modify the version information of a cloud application.
     * @param req ModifyApplicationVersionRequest
     * @return ModifyApplicationVersionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationVersionResponse ModifyApplicationVersion(ModifyApplicationVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationVersion", ModifyApplicationVersionResponse.class);
    }

    /**
     *This API is used to modify the mobile application data.
     * @param req ModifyMobileApplicationInfoRequest
     * @return ModifyMobileApplicationInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMobileApplicationInfoResponse ModifyMobileApplicationInfo(ModifyMobileApplicationInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMobileApplicationInfo", ModifyMobileApplicationInfoResponse.class);
    }

    /**
     *This API is used to launch an application version.
     * @param req SetApplicationVersionOnlineRequest
     * @return SetApplicationVersionOnlineResponse
     * @throws TencentCloudSDKException
     */
    public SetApplicationVersionOnlineResponse SetApplicationVersionOnline(SetApplicationVersionOnlineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetApplicationVersionOnline", SetApplicationVersionOnlineResponse.class);
    }

    /**
     *This API is used to start cloud-based streaming. The codec for the cloud-based streaming is automatically selected based on the client's (SDK) capabilities, with a default order of H.265, H.264, VP8, and VP9.
     * @param req StartPublishStreamRequest
     * @return StartPublishStreamResponse
     * @throws TencentCloudSDKException
     */
    public StartPublishStreamResponse StartPublishStream(StartPublishStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartPublishStream", StartPublishStreamResponse.class);
    }

    /**
     *This API is used to start cloud-based streaming to the specified URL. The codec for the cloud-based streaming is automatically selected based on the client's (SDK) capabilities, with a default order of H.265, H.264, VP8, and VP9. This streaming method will be billed separately. For details about the billing method, see [Charging for Streaming to Specified URL](https://intl.cloud.tencent.com/document/product/1547/72168?from_cn_redirect=1#98ac188a-d122-4caf-88be-05268ecefdf6).
     * @param req StartPublishStreamWithURLRequest
     * @return StartPublishStreamWithURLResponse
     * @throws TencentCloudSDKException
     */
    public StartPublishStreamWithURLResponse StartPublishStreamWithURL(StartPublishStreamWithURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartPublishStreamWithURL", StartPublishStreamWithURLResponse.class);
    }

    /**
     *This API is used to stop cloud-based streaming.
     * @param req StopPublishStreamRequest
     * @return StopPublishStreamResponse
     * @throws TencentCloudSDKException
     */
    public StopPublishStreamResponse StopPublishStream(StopPublishStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopPublishStream", StopPublishStreamResponse.class);
    }

}
