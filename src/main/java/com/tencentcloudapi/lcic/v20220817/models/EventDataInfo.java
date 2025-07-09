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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventDataInfo extends AbstractModel {

    /**
    * The room ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * The ID of the user to whom the event occurred.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * User device type. 0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Wechat Mini Program.
    */
    @SerializedName("Device")
    @Expose
    private Long Device;

    /**
    * Recording time. Unit: seconds
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Recorded file size
    */
    @SerializedName("RecordSize")
    @Expose
    private Long RecordSize;

    /**
    * Recording url
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
     * Get The room ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoomId The room ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set The room ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoomId The room ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get The ID of the user to whom the event occurred.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserId The ID of the user to whom the event occurred.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The ID of the user to whom the event occurred.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserId The ID of the user to whom the event occurred.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get User device type. 0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Wechat Mini Program. 
     * @return Device User device type. 0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Wechat Mini Program.
     */
    public Long getDevice() {
        return this.Device;
    }

    /**
     * Set User device type. 0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Wechat Mini Program.
     * @param Device User device type. 0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Wechat Mini Program.
     */
    public void setDevice(Long Device) {
        this.Device = Device;
    }

    /**
     * Get Recording time. Unit: seconds 
     * @return Duration Recording time. Unit: seconds
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Recording time. Unit: seconds
     * @param Duration Recording time. Unit: seconds
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Recorded file size 
     * @return RecordSize Recorded file size
     */
    public Long getRecordSize() {
        return this.RecordSize;
    }

    /**
     * Set Recorded file size
     * @param RecordSize Recorded file size
     */
    public void setRecordSize(Long RecordSize) {
        this.RecordSize = RecordSize;
    }

    /**
     * Get Recording url 
     * @return RecordUrl Recording url
     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set Recording url
     * @param RecordUrl Recording url
     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    public EventDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventDataInfo(EventDataInfo source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Device != null) {
            this.Device = new Long(source.Device);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.RecordSize != null) {
            this.RecordSize = new Long(source.RecordSize);
        }
        if (source.RecordUrl != null) {
            this.RecordUrl = new String(source.RecordUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Device", this.Device);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "RecordSize", this.RecordSize);
        this.setParamSimple(map, prefix + "RecordUrl", this.RecordUrl);

    }
}

