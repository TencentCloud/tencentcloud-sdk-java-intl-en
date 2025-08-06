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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudSliceTaskRequest extends AbstractModel {

    /**
    * [SdkAppId](https://www.tencentcloud.comom/document/product/647/46351?from_cn_redirect=1#sdkappid) of TRTC, which is the same as the SdkAppId corresponding to the TRTC room.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * [RoomId](https://www.tencentcloud.comom/document/product/647/46351?from_cn_redirect=1#roomid) of TRTC, which is the RoomId corresponding to the TRTC room.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * Chatbot's UserId, which is used to enter the room and initiate a slicing task. [*note] This UserId should not be duplicated with the UserIds of the current anchors or audience members in the room. If multiple slicing tasks are initiated in one room, the chatbot's UserId should also be unique; otherwise, the previous slicing task is interrupted. It is recommended to include the room ID as part of the UserId, ensuring that the chatbot's UserId is unique in the room.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Signature verification corresponding to the chatbot's UserId, namely, the UserId and UserSig serve as the login password for the chatbot to enter the room. For specific calculation methods, see TRTC solution for calculating UserSig.
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * Control parameters for cloud slicing.
    */
    @SerializedName("SliceParams")
    @Expose
    private SliceParams SliceParams;

    /**
    * Parameters for uploading cloud slicing files to the cloud storage.
    */
    @SerializedName("SliceStorageParams")
    @Expose
    private SliceStorageParams SliceStorageParams;

    /**
    * Type of the TRTC room number. [*Note] It should be the same as the type of the RoomId corresponding to the recording room. 0: string type; 1: 32-bit integer type (default value). Example value: 1.
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * Validity period for calling the API, which starts upon successful initiation of recording and obtaining the task ID. After the timeout, APIs such as querying, updating, or stopping cannot be called, but the recording task is not stopped. The unit of the parameter is hours, with a default value of 72 hours (3 days). The maximum value is 720 hours (30 days), while the minimum value is 6 hours. For example, if this parameter is not specified, the validity period for calling the querying, updating, and stopping recording APIs is 72 hours upon the successful start of recording. Example value: 24.
    */
    @SerializedName("ResourceExpiredHour")
    @Expose
    private Long ResourceExpiredHour;

    /**
    * TRTC room permission encryption string, which is required only when advanced permission control is enabled in the TRTC console. After enabling, the TRTC backend service system verifies a "permission ticket" called [PrivateMapKey], which contains an encrypted RoomId and an encrypted "permission bit list". Since the PrivateMapKey includes the RoomId, the specified room cannot be entered if only UserSig is provided and PrivateMapKey is not provided. Example value: eJw1jcEKgkAURX9FZlvY****fL9rfNX4_.
    */
    @SerializedName("PrivateMapKey")
    @Expose
    private String PrivateMapKey;

    /**
     * Get [SdkAppId](https://www.tencentcloud.comom/document/product/647/46351?from_cn_redirect=1#sdkappid) of TRTC, which is the same as the SdkAppId corresponding to the TRTC room. 
     * @return SdkAppId [SdkAppId](https://www.tencentcloud.comom/document/product/647/46351?from_cn_redirect=1#sdkappid) of TRTC, which is the same as the SdkAppId corresponding to the TRTC room.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set [SdkAppId](https://www.tencentcloud.comom/document/product/647/46351?from_cn_redirect=1#sdkappid) of TRTC, which is the same as the SdkAppId corresponding to the TRTC room.
     * @param SdkAppId [SdkAppId](https://www.tencentcloud.comom/document/product/647/46351?from_cn_redirect=1#sdkappid) of TRTC, which is the same as the SdkAppId corresponding to the TRTC room.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get [RoomId](https://www.tencentcloud.comom/document/product/647/46351?from_cn_redirect=1#roomid) of TRTC, which is the RoomId corresponding to the TRTC room. 
     * @return RoomId [RoomId](https://www.tencentcloud.comom/document/product/647/46351?from_cn_redirect=1#roomid) of TRTC, which is the RoomId corresponding to the TRTC room.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set [RoomId](https://www.tencentcloud.comom/document/product/647/46351?from_cn_redirect=1#roomid) of TRTC, which is the RoomId corresponding to the TRTC room.
     * @param RoomId [RoomId](https://www.tencentcloud.comom/document/product/647/46351?from_cn_redirect=1#roomid) of TRTC, which is the RoomId corresponding to the TRTC room.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Chatbot's UserId, which is used to enter the room and initiate a slicing task. [*note] This UserId should not be duplicated with the UserIds of the current anchors or audience members in the room. If multiple slicing tasks are initiated in one room, the chatbot's UserId should also be unique; otherwise, the previous slicing task is interrupted. It is recommended to include the room ID as part of the UserId, ensuring that the chatbot's UserId is unique in the room. 
     * @return UserId Chatbot's UserId, which is used to enter the room and initiate a slicing task. [*note] This UserId should not be duplicated with the UserIds of the current anchors or audience members in the room. If multiple slicing tasks are initiated in one room, the chatbot's UserId should also be unique; otherwise, the previous slicing task is interrupted. It is recommended to include the room ID as part of the UserId, ensuring that the chatbot's UserId is unique in the room.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set Chatbot's UserId, which is used to enter the room and initiate a slicing task. [*note] This UserId should not be duplicated with the UserIds of the current anchors or audience members in the room. If multiple slicing tasks are initiated in one room, the chatbot's UserId should also be unique; otherwise, the previous slicing task is interrupted. It is recommended to include the room ID as part of the UserId, ensuring that the chatbot's UserId is unique in the room.
     * @param UserId Chatbot's UserId, which is used to enter the room and initiate a slicing task. [*note] This UserId should not be duplicated with the UserIds of the current anchors or audience members in the room. If multiple slicing tasks are initiated in one room, the chatbot's UserId should also be unique; otherwise, the previous slicing task is interrupted. It is recommended to include the room ID as part of the UserId, ensuring that the chatbot's UserId is unique in the room.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Signature verification corresponding to the chatbot's UserId, namely, the UserId and UserSig serve as the login password for the chatbot to enter the room. For specific calculation methods, see TRTC solution for calculating UserSig. 
     * @return UserSig Signature verification corresponding to the chatbot's UserId, namely, the UserId and UserSig serve as the login password for the chatbot to enter the room. For specific calculation methods, see TRTC solution for calculating UserSig.
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set Signature verification corresponding to the chatbot's UserId, namely, the UserId and UserSig serve as the login password for the chatbot to enter the room. For specific calculation methods, see TRTC solution for calculating UserSig.
     * @param UserSig Signature verification corresponding to the chatbot's UserId, namely, the UserId and UserSig serve as the login password for the chatbot to enter the room. For specific calculation methods, see TRTC solution for calculating UserSig.
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get Control parameters for cloud slicing. 
     * @return SliceParams Control parameters for cloud slicing.
     */
    public SliceParams getSliceParams() {
        return this.SliceParams;
    }

    /**
     * Set Control parameters for cloud slicing.
     * @param SliceParams Control parameters for cloud slicing.
     */
    public void setSliceParams(SliceParams SliceParams) {
        this.SliceParams = SliceParams;
    }

    /**
     * Get Parameters for uploading cloud slicing files to the cloud storage. 
     * @return SliceStorageParams Parameters for uploading cloud slicing files to the cloud storage.
     */
    public SliceStorageParams getSliceStorageParams() {
        return this.SliceStorageParams;
    }

    /**
     * Set Parameters for uploading cloud slicing files to the cloud storage.
     * @param SliceStorageParams Parameters for uploading cloud slicing files to the cloud storage.
     */
    public void setSliceStorageParams(SliceStorageParams SliceStorageParams) {
        this.SliceStorageParams = SliceStorageParams;
    }

    /**
     * Get Type of the TRTC room number. [*Note] It should be the same as the type of the RoomId corresponding to the recording room. 0: string type; 1: 32-bit integer type (default value). Example value: 1. 
     * @return RoomIdType Type of the TRTC room number. [*Note] It should be the same as the type of the RoomId corresponding to the recording room. 0: string type; 1: 32-bit integer type (default value). Example value: 1.
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set Type of the TRTC room number. [*Note] It should be the same as the type of the RoomId corresponding to the recording room. 0: string type; 1: 32-bit integer type (default value). Example value: 1.
     * @param RoomIdType Type of the TRTC room number. [*Note] It should be the same as the type of the RoomId corresponding to the recording room. 0: string type; 1: 32-bit integer type (default value). Example value: 1.
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get Validity period for calling the API, which starts upon successful initiation of recording and obtaining the task ID. After the timeout, APIs such as querying, updating, or stopping cannot be called, but the recording task is not stopped. The unit of the parameter is hours, with a default value of 72 hours (3 days). The maximum value is 720 hours (30 days), while the minimum value is 6 hours. For example, if this parameter is not specified, the validity period for calling the querying, updating, and stopping recording APIs is 72 hours upon the successful start of recording. Example value: 24. 
     * @return ResourceExpiredHour Validity period for calling the API, which starts upon successful initiation of recording and obtaining the task ID. After the timeout, APIs such as querying, updating, or stopping cannot be called, but the recording task is not stopped. The unit of the parameter is hours, with a default value of 72 hours (3 days). The maximum value is 720 hours (30 days), while the minimum value is 6 hours. For example, if this parameter is not specified, the validity period for calling the querying, updating, and stopping recording APIs is 72 hours upon the successful start of recording. Example value: 24.
     */
    public Long getResourceExpiredHour() {
        return this.ResourceExpiredHour;
    }

    /**
     * Set Validity period for calling the API, which starts upon successful initiation of recording and obtaining the task ID. After the timeout, APIs such as querying, updating, or stopping cannot be called, but the recording task is not stopped. The unit of the parameter is hours, with a default value of 72 hours (3 days). The maximum value is 720 hours (30 days), while the minimum value is 6 hours. For example, if this parameter is not specified, the validity period for calling the querying, updating, and stopping recording APIs is 72 hours upon the successful start of recording. Example value: 24.
     * @param ResourceExpiredHour Validity period for calling the API, which starts upon successful initiation of recording and obtaining the task ID. After the timeout, APIs such as querying, updating, or stopping cannot be called, but the recording task is not stopped. The unit of the parameter is hours, with a default value of 72 hours (3 days). The maximum value is 720 hours (30 days), while the minimum value is 6 hours. For example, if this parameter is not specified, the validity period for calling the querying, updating, and stopping recording APIs is 72 hours upon the successful start of recording. Example value: 24.
     */
    public void setResourceExpiredHour(Long ResourceExpiredHour) {
        this.ResourceExpiredHour = ResourceExpiredHour;
    }

    /**
     * Get TRTC room permission encryption string, which is required only when advanced permission control is enabled in the TRTC console. After enabling, the TRTC backend service system verifies a "permission ticket" called [PrivateMapKey], which contains an encrypted RoomId and an encrypted "permission bit list". Since the PrivateMapKey includes the RoomId, the specified room cannot be entered if only UserSig is provided and PrivateMapKey is not provided. Example value: eJw1jcEKgkAURX9FZlvY****fL9rfNX4_. 
     * @return PrivateMapKey TRTC room permission encryption string, which is required only when advanced permission control is enabled in the TRTC console. After enabling, the TRTC backend service system verifies a "permission ticket" called [PrivateMapKey], which contains an encrypted RoomId and an encrypted "permission bit list". Since the PrivateMapKey includes the RoomId, the specified room cannot be entered if only UserSig is provided and PrivateMapKey is not provided. Example value: eJw1jcEKgkAURX9FZlvY****fL9rfNX4_.
     */
    public String getPrivateMapKey() {
        return this.PrivateMapKey;
    }

    /**
     * Set TRTC room permission encryption string, which is required only when advanced permission control is enabled in the TRTC console. After enabling, the TRTC backend service system verifies a "permission ticket" called [PrivateMapKey], which contains an encrypted RoomId and an encrypted "permission bit list". Since the PrivateMapKey includes the RoomId, the specified room cannot be entered if only UserSig is provided and PrivateMapKey is not provided. Example value: eJw1jcEKgkAURX9FZlvY****fL9rfNX4_.
     * @param PrivateMapKey TRTC room permission encryption string, which is required only when advanced permission control is enabled in the TRTC console. After enabling, the TRTC backend service system verifies a "permission ticket" called [PrivateMapKey], which contains an encrypted RoomId and an encrypted "permission bit list". Since the PrivateMapKey includes the RoomId, the specified room cannot be entered if only UserSig is provided and PrivateMapKey is not provided. Example value: eJw1jcEKgkAURX9FZlvY****fL9rfNX4_.
     */
    public void setPrivateMapKey(String PrivateMapKey) {
        this.PrivateMapKey = PrivateMapKey;
    }

    public CreateCloudSliceTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudSliceTaskRequest(CreateCloudSliceTaskRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserSig != null) {
            this.UserSig = new String(source.UserSig);
        }
        if (source.SliceParams != null) {
            this.SliceParams = new SliceParams(source.SliceParams);
        }
        if (source.SliceStorageParams != null) {
            this.SliceStorageParams = new SliceStorageParams(source.SliceStorageParams);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.ResourceExpiredHour != null) {
            this.ResourceExpiredHour = new Long(source.ResourceExpiredHour);
        }
        if (source.PrivateMapKey != null) {
            this.PrivateMapKey = new String(source.PrivateMapKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserSig", this.UserSig);
        this.setParamObj(map, prefix + "SliceParams.", this.SliceParams);
        this.setParamObj(map, prefix + "SliceStorageParams.", this.SliceStorageParams);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamSimple(map, prefix + "ResourceExpiredHour", this.ResourceExpiredHour);
        this.setParamSimple(map, prefix + "PrivateMapKey", this.PrivateMapKey);

    }
}

