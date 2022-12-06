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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanPiece extends AbstractModel{

    /**
    * Audio retention address, which will be returned for stream detection. The audio will be retained for 30 minutes.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DumpUrl")
    @Expose
    private String DumpUrl;

    /**
    * Whether non-compliant information is detected
    */
    @SerializedName("HitFlag")
    @Expose
    private Boolean HitFlag;

    /**
    * Main non-compliant content type
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MainType")
    @Expose
    private String MainType;

    /**
    * Voice detection details
    */
    @SerializedName("ScanDetail")
    @Expose
    private ScanDetail [] ScanDetail;

    /**
    * GME Voice Chat room ID, which is the `RoomId` passed through when the task was submitted.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * GME Voice Chat user ID, which is the `OpenId` passed through when the task was submitted.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * Remarks
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * Offset time of multipart in stream during stream detection (in milliseconds)
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Multipart duration during stream detection
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Multipart detection start time
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PieceStartTime")
    @Expose
    private Long PieceStartTime;

    /**
     * Get Audio retention address, which will be returned for stream detection. The audio will be retained for 30 minutes.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DumpUrl Audio retention address, which will be returned for stream detection. The audio will be retained for 30 minutes.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDumpUrl() {
        return this.DumpUrl;
    }

    /**
     * Set Audio retention address, which will be returned for stream detection. The audio will be retained for 30 minutes.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DumpUrl Audio retention address, which will be returned for stream detection. The audio will be retained for 30 minutes.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDumpUrl(String DumpUrl) {
        this.DumpUrl = DumpUrl;
    }

    /**
     * Get Whether non-compliant information is detected 
     * @return HitFlag Whether non-compliant information is detected
     */
    public Boolean getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set Whether non-compliant information is detected
     * @param HitFlag Whether non-compliant information is detected
     */
    public void setHitFlag(Boolean HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get Main non-compliant content type
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return MainType Main non-compliant content type
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getMainType() {
        return this.MainType;
    }

    /**
     * Set Main non-compliant content type
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param MainType Main non-compliant content type
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMainType(String MainType) {
        this.MainType = MainType;
    }

    /**
     * Get Voice detection details 
     * @return ScanDetail Voice detection details
     */
    public ScanDetail [] getScanDetail() {
        return this.ScanDetail;
    }

    /**
     * Set Voice detection details
     * @param ScanDetail Voice detection details
     */
    public void setScanDetail(ScanDetail [] ScanDetail) {
        this.ScanDetail = ScanDetail;
    }

    /**
     * Get GME Voice Chat room ID, which is the `RoomId` passed through when the task was submitted.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return RoomId GME Voice Chat room ID, which is the `RoomId` passed through when the task was submitted.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set GME Voice Chat room ID, which is the `RoomId` passed through when the task was submitted.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param RoomId GME Voice Chat room ID, which is the `RoomId` passed through when the task was submitted.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get GME Voice Chat user ID, which is the `OpenId` passed through when the task was submitted.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return OpenId GME Voice Chat user ID, which is the `OpenId` passed through when the task was submitted.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set GME Voice Chat user ID, which is the `OpenId` passed through when the task was submitted.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param OpenId GME Voice Chat user ID, which is the `OpenId` passed through when the task was submitted.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get Remarks
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Info Remarks
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set Remarks
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Info Remarks
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get Offset time of multipart in stream during stream detection (in milliseconds)
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Offset Offset time of multipart in stream during stream detection (in milliseconds)
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset time of multipart in stream during stream detection (in milliseconds)
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Offset Offset time of multipart in stream during stream detection (in milliseconds)
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Multipart duration during stream detection
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Duration Multipart duration during stream detection
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Multipart duration during stream detection
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Duration Multipart duration during stream detection
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Multipart detection start time
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return PieceStartTime Multipart detection start time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getPieceStartTime() {
        return this.PieceStartTime;
    }

    /**
     * Set Multipart detection start time
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param PieceStartTime Multipart detection start time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPieceStartTime(Long PieceStartTime) {
        this.PieceStartTime = PieceStartTime;
    }

    public ScanPiece() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanPiece(ScanPiece source) {
        if (source.DumpUrl != null) {
            this.DumpUrl = new String(source.DumpUrl);
        }
        if (source.HitFlag != null) {
            this.HitFlag = new Boolean(source.HitFlag);
        }
        if (source.MainType != null) {
            this.MainType = new String(source.MainType);
        }
        if (source.ScanDetail != null) {
            this.ScanDetail = new ScanDetail[source.ScanDetail.length];
            for (int i = 0; i < source.ScanDetail.length; i++) {
                this.ScanDetail[i] = new ScanDetail(source.ScanDetail[i]);
            }
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.PieceStartTime != null) {
            this.PieceStartTime = new Long(source.PieceStartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DumpUrl", this.DumpUrl);
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamSimple(map, prefix + "MainType", this.MainType);
        this.setParamArrayObj(map, prefix + "ScanDetail.", this.ScanDetail);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "PieceStartTime", this.PieceStartTime);

    }
}

