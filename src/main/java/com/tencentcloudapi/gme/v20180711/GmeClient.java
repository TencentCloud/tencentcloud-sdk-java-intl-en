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
package com.tencentcloudapi.gme.v20180711;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.gme.v20180711.models.*;

public class GmeClient extends AbstractClient{
    private static String endpoint = "gme.intl.tencentcloudapi.com";
    private static String service = "gme";
    private static String version = "2018-07-11";
    
    public GmeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public GmeClient(Credential credential, String region, ClientProfile profile) {
        super(GmeClient.endpoint, GmeClient.version, credential, region, profile);
    }

    /**
     *This API is used to create a GME application.
     * @param req CreateAppRequest
     * @return CreateAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateAppResponse CreateApp(CreateAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApp", CreateAppResponse.class);
    }

    /**
     *This API is used to delete a room or remove members from the room.
     * @param req DeleteRoomMemberRequest
     * @return DeleteRoomMemberResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoomMemberResponse DeleteRoomMember(DeleteRoomMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoomMember", DeleteRoomMemberResponse.class);
    }

    /**
     *This API is used to query the usage statistics of a GME application, including those of Voice Chat, Voice Message Service, Voice Analysis, etc. The maximum query period is the past 30 days.
     * @param req DescribeAppStatisticsRequest
     * @return DescribeAppStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppStatisticsResponse DescribeAppStatistics(DescribeAppStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppStatistics", DescribeAppStatisticsResponse.class);
    }

    /**
     *This API is used to query data details for up to the past 90 days.
     * @param req DescribeApplicationDataRequest
     * @return DescribeApplicationDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationDataResponse DescribeApplicationData(DescribeApplicationDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationData", DescribeApplicationDataResponse.class);
    }

    /**
     *This API is used to query a recording task.
     * @param req DescribeRecordInfoRequest
     * @return DescribeRecordInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordInfoResponse DescribeRecordInfo(DescribeRecordInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordInfo", DescribeRecordInfoResponse.class);
    }

    /**
     *This API is used to query the recording task in a room.
     * @param req DescribeTaskInfoRequest
     * @return DescribeTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskInfoResponse DescribeTaskInfo(DescribeTaskInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskInfo", DescribeTaskInfoResponse.class);
    }

    /**
     *This API is used to change the status of an application.
     * @param req ModifyAppStatusRequest
     * @return ModifyAppStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAppStatusResponse ModifyAppStatus(ModifyAppStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAppStatus", ModifyAppStatusResponse.class);
    }

    /**
     *This API is used to modify recording configurations.
     * @param req ModifyRecordInfoRequest
     * @return ModifyRecordInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordInfoResponse ModifyRecordInfo(ModifyRecordInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRecordInfo", ModifyRecordInfoResponse.class);
    }

    /**
     *This API is used to start recording.
     * @param req StartRecordRequest
     * @return StartRecordResponse
     * @throws TencentCloudSDKException
     */
    public StartRecordResponse StartRecord(StartRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartRecord", StartRecordResponse.class);
    }

    /**
     *This API is used to stop recording.

     * @param req StopRecordRequest
     * @return StopRecordResponse
     * @throws TencentCloudSDKException
     */
    public StopRecordResponse StopRecord(StopRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopRecord", StopRecordResponse.class);
    }

}
