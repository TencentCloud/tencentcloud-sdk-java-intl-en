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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudRecordingRequest extends AbstractModel{

    /**
    * The [SDKAppID](https://intl.cloud.tencent.com/document/product/647/37714) of the TRTC room whose streams are recorded.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The [room ID](https://intl.cloud.tencent.com/document/product/647/37714) of the TRTC room whose streams are recorded.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * The [user ID](https://intl.cloud.tencent.com/document/product/647/37714) of the recording robot in the TRTC room, which cannot be the same as a user ID already in use. We recommend you include this user ID in the room ID.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * The signature (similar to login password) required for the recording robot to enter the room. For information on how to calculate the signature, see [What is UserSig?](https://intl.cloud.tencent.com/document/product/647/38104). |
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * The on-cloud recording parameters.
    */
    @SerializedName("RecordParams")
    @Expose
    private RecordParams RecordParams;

    /**
    * The cloud storage parameters.
    */
    @SerializedName("StorageParams")
    @Expose
    private StorageParams StorageParams;

    /**
    * The type of the TRTC room ID, which must be the same as the ID type of the room whose streams are recorded.
0: String
1: 32-bit integer (default)
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * The stream mixing parameters, which are valid if the mixed-stream recording mode is used.
    */
    @SerializedName("MixTranscodeParams")
    @Expose
    private MixTranscodeParams MixTranscodeParams;

    /**
    * The layout parameters, which are valid if the mixed-stream recording mode is used.
    */
    @SerializedName("MixLayoutParams")
    @Expose
    private MixLayoutParams MixLayoutParams;

    /**
    * The amount of time (in hours) during which API requests can be made after recording starts. Calculation starts when a recording task is started (when the recording task ID is returned). Once the period elapses, the query, modification, and stop recording APIs can no longer be called, but the recording task will continue. The default value is `72` (three days), and the maximum and minimum values allowed are `720` (30 days) and `6` respectively. If you do not set this parameter, the query, modification, and stop recording APIs can be called within 72 hours after recording starts.
    */
    @SerializedName("ResourceExpiredHour")
    @Expose
    private Long ResourceExpiredHour;

    /**
    * The permission ticket for a TRTC room. This parameter is required if advanced permission control is enabled in the console, in which case the TRTC backend will verify users’ [PrivateMapKey](https://intl.cloud.tencent.com/document/product/647/32240?from_cn_redirect=1), which include an encrypted room ID and permission bit list. A user providing only `UserSig` and not `PrivateMapKey` will be unable to enter the room.
    */
    @SerializedName("PrivateMapKey")
    @Expose
    private String PrivateMapKey;

    /**
     * Get The [SDKAppID](https://intl.cloud.tencent.com/document/product/647/37714) of the TRTC room whose streams are recorded. 
     * @return SdkAppId The [SDKAppID](https://intl.cloud.tencent.com/document/product/647/37714) of the TRTC room whose streams are recorded.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The [SDKAppID](https://intl.cloud.tencent.com/document/product/647/37714) of the TRTC room whose streams are recorded.
     * @param SdkAppId The [SDKAppID](https://intl.cloud.tencent.com/document/product/647/37714) of the TRTC room whose streams are recorded.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The [room ID](https://intl.cloud.tencent.com/document/product/647/37714) of the TRTC room whose streams are recorded. 
     * @return RoomId The [room ID](https://intl.cloud.tencent.com/document/product/647/37714) of the TRTC room whose streams are recorded.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set The [room ID](https://intl.cloud.tencent.com/document/product/647/37714) of the TRTC room whose streams are recorded.
     * @param RoomId The [room ID](https://intl.cloud.tencent.com/document/product/647/37714) of the TRTC room whose streams are recorded.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get The [user ID](https://intl.cloud.tencent.com/document/product/647/37714) of the recording robot in the TRTC room, which cannot be the same as a user ID already in use. We recommend you include this user ID in the room ID. 
     * @return UserId The [user ID](https://intl.cloud.tencent.com/document/product/647/37714) of the recording robot in the TRTC room, which cannot be the same as a user ID already in use. We recommend you include this user ID in the room ID.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The [user ID](https://intl.cloud.tencent.com/document/product/647/37714) of the recording robot in the TRTC room, which cannot be the same as a user ID already in use. We recommend you include this user ID in the room ID.
     * @param UserId The [user ID](https://intl.cloud.tencent.com/document/product/647/37714) of the recording robot in the TRTC room, which cannot be the same as a user ID already in use. We recommend you include this user ID in the room ID.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get The signature (similar to login password) required for the recording robot to enter the room. For information on how to calculate the signature, see [What is UserSig?](https://intl.cloud.tencent.com/document/product/647/38104). | 
     * @return UserSig The signature (similar to login password) required for the recording robot to enter the room. For information on how to calculate the signature, see [What is UserSig?](https://intl.cloud.tencent.com/document/product/647/38104). |
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set The signature (similar to login password) required for the recording robot to enter the room. For information on how to calculate the signature, see [What is UserSig?](https://intl.cloud.tencent.com/document/product/647/38104). |
     * @param UserSig The signature (similar to login password) required for the recording robot to enter the room. For information on how to calculate the signature, see [What is UserSig?](https://intl.cloud.tencent.com/document/product/647/38104). |
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get The on-cloud recording parameters. 
     * @return RecordParams The on-cloud recording parameters.
     */
    public RecordParams getRecordParams() {
        return this.RecordParams;
    }

    /**
     * Set The on-cloud recording parameters.
     * @param RecordParams The on-cloud recording parameters.
     */
    public void setRecordParams(RecordParams RecordParams) {
        this.RecordParams = RecordParams;
    }

    /**
     * Get The cloud storage parameters. 
     * @return StorageParams The cloud storage parameters.
     */
    public StorageParams getStorageParams() {
        return this.StorageParams;
    }

    /**
     * Set The cloud storage parameters.
     * @param StorageParams The cloud storage parameters.
     */
    public void setStorageParams(StorageParams StorageParams) {
        this.StorageParams = StorageParams;
    }

    /**
     * Get The type of the TRTC room ID, which must be the same as the ID type of the room whose streams are recorded.
0: String
1: 32-bit integer (default) 
     * @return RoomIdType The type of the TRTC room ID, which must be the same as the ID type of the room whose streams are recorded.
0: String
1: 32-bit integer (default)
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set The type of the TRTC room ID, which must be the same as the ID type of the room whose streams are recorded.
0: String
1: 32-bit integer (default)
     * @param RoomIdType The type of the TRTC room ID, which must be the same as the ID type of the room whose streams are recorded.
0: String
1: 32-bit integer (default)
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get The stream mixing parameters, which are valid if the mixed-stream recording mode is used. 
     * @return MixTranscodeParams The stream mixing parameters, which are valid if the mixed-stream recording mode is used.
     */
    public MixTranscodeParams getMixTranscodeParams() {
        return this.MixTranscodeParams;
    }

    /**
     * Set The stream mixing parameters, which are valid if the mixed-stream recording mode is used.
     * @param MixTranscodeParams The stream mixing parameters, which are valid if the mixed-stream recording mode is used.
     */
    public void setMixTranscodeParams(MixTranscodeParams MixTranscodeParams) {
        this.MixTranscodeParams = MixTranscodeParams;
    }

    /**
     * Get The layout parameters, which are valid if the mixed-stream recording mode is used. 
     * @return MixLayoutParams The layout parameters, which are valid if the mixed-stream recording mode is used.
     */
    public MixLayoutParams getMixLayoutParams() {
        return this.MixLayoutParams;
    }

    /**
     * Set The layout parameters, which are valid if the mixed-stream recording mode is used.
     * @param MixLayoutParams The layout parameters, which are valid if the mixed-stream recording mode is used.
     */
    public void setMixLayoutParams(MixLayoutParams MixLayoutParams) {
        this.MixLayoutParams = MixLayoutParams;
    }

    /**
     * Get The amount of time (in hours) during which API requests can be made after recording starts. Calculation starts when a recording task is started (when the recording task ID is returned). Once the period elapses, the query, modification, and stop recording APIs can no longer be called, but the recording task will continue. The default value is `72` (three days), and the maximum and minimum values allowed are `720` (30 days) and `6` respectively. If you do not set this parameter, the query, modification, and stop recording APIs can be called within 72 hours after recording starts. 
     * @return ResourceExpiredHour The amount of time (in hours) during which API requests can be made after recording starts. Calculation starts when a recording task is started (when the recording task ID is returned). Once the period elapses, the query, modification, and stop recording APIs can no longer be called, but the recording task will continue. The default value is `72` (three days), and the maximum and minimum values allowed are `720` (30 days) and `6` respectively. If you do not set this parameter, the query, modification, and stop recording APIs can be called within 72 hours after recording starts.
     */
    public Long getResourceExpiredHour() {
        return this.ResourceExpiredHour;
    }

    /**
     * Set The amount of time (in hours) during which API requests can be made after recording starts. Calculation starts when a recording task is started (when the recording task ID is returned). Once the period elapses, the query, modification, and stop recording APIs can no longer be called, but the recording task will continue. The default value is `72` (three days), and the maximum and minimum values allowed are `720` (30 days) and `6` respectively. If you do not set this parameter, the query, modification, and stop recording APIs can be called within 72 hours after recording starts.
     * @param ResourceExpiredHour The amount of time (in hours) during which API requests can be made after recording starts. Calculation starts when a recording task is started (when the recording task ID is returned). Once the period elapses, the query, modification, and stop recording APIs can no longer be called, but the recording task will continue. The default value is `72` (three days), and the maximum and minimum values allowed are `720` (30 days) and `6` respectively. If you do not set this parameter, the query, modification, and stop recording APIs can be called within 72 hours after recording starts.
     */
    public void setResourceExpiredHour(Long ResourceExpiredHour) {
        this.ResourceExpiredHour = ResourceExpiredHour;
    }

    /**
     * Get The permission ticket for a TRTC room. This parameter is required if advanced permission control is enabled in the console, in which case the TRTC backend will verify users’ [PrivateMapKey](https://intl.cloud.tencent.com/document/product/647/32240?from_cn_redirect=1), which include an encrypted room ID and permission bit list. A user providing only `UserSig` and not `PrivateMapKey` will be unable to enter the room. 
     * @return PrivateMapKey The permission ticket for a TRTC room. This parameter is required if advanced permission control is enabled in the console, in which case the TRTC backend will verify users’ [PrivateMapKey](https://intl.cloud.tencent.com/document/product/647/32240?from_cn_redirect=1), which include an encrypted room ID and permission bit list. A user providing only `UserSig` and not `PrivateMapKey` will be unable to enter the room.
     */
    public String getPrivateMapKey() {
        return this.PrivateMapKey;
    }

    /**
     * Set The permission ticket for a TRTC room. This parameter is required if advanced permission control is enabled in the console, in which case the TRTC backend will verify users’ [PrivateMapKey](https://intl.cloud.tencent.com/document/product/647/32240?from_cn_redirect=1), which include an encrypted room ID and permission bit list. A user providing only `UserSig` and not `PrivateMapKey` will be unable to enter the room.
     * @param PrivateMapKey The permission ticket for a TRTC room. This parameter is required if advanced permission control is enabled in the console, in which case the TRTC backend will verify users’ [PrivateMapKey](https://intl.cloud.tencent.com/document/product/647/32240?from_cn_redirect=1), which include an encrypted room ID and permission bit list. A user providing only `UserSig` and not `PrivateMapKey` will be unable to enter the room.
     */
    public void setPrivateMapKey(String PrivateMapKey) {
        this.PrivateMapKey = PrivateMapKey;
    }

    public CreateCloudRecordingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudRecordingRequest(CreateCloudRecordingRequest source) {
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
        if (source.RecordParams != null) {
            this.RecordParams = new RecordParams(source.RecordParams);
        }
        if (source.StorageParams != null) {
            this.StorageParams = new StorageParams(source.StorageParams);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.MixTranscodeParams != null) {
            this.MixTranscodeParams = new MixTranscodeParams(source.MixTranscodeParams);
        }
        if (source.MixLayoutParams != null) {
            this.MixLayoutParams = new MixLayoutParams(source.MixLayoutParams);
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
        this.setParamObj(map, prefix + "RecordParams.", this.RecordParams);
        this.setParamObj(map, prefix + "StorageParams.", this.StorageParams);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamObj(map, prefix + "MixTranscodeParams.", this.MixTranscodeParams);
        this.setParamObj(map, prefix + "MixLayoutParams.", this.MixLayoutParams);
        this.setParamSimple(map, prefix + "ResourceExpiredHour", this.ResourceExpiredHour);
        this.setParamSimple(map, prefix + "PrivateMapKey", this.PrivateMapKey);

    }
}

