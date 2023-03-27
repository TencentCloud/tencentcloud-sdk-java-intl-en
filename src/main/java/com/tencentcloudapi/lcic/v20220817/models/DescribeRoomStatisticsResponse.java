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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoomStatisticsResponse extends AbstractModel{

    /**
    * Peak number of online members
    */
    @SerializedName("PeakMemberNumber")
    @Expose
    private Long PeakMemberNumber;

    /**
    * Accumulated number of online members
    */
    @SerializedName("MemberNumber")
    @Expose
    private Long MemberNumber;

    /**
    * Total number of records, including members who entered the room and members who should attend the class but did not
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Member record list
    */
    @SerializedName("MemberRecords")
    @Expose
    private MemberRecord [] MemberRecords;

    /**
    * The actual start time of the room, in Unix timestamp, accurate to seconds. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealStartTime")
    @Expose
    private Long RealStartTime;

    /**
    * The actual end time of the room, in Unix timestamp, accurate to seconds. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RealEndTime")
    @Expose
    private Long RealEndTime;

    /**
    * The total message count of the room.
    */
    @SerializedName("MessageCount")
    @Expose
    private Long MessageCount;

    /**
    * The total number of mic-on students in the room.
    */
    @SerializedName("MicCount")
    @Expose
    private Long MicCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Peak number of online members 
     * @return PeakMemberNumber Peak number of online members
     */
    public Long getPeakMemberNumber() {
        return this.PeakMemberNumber;
    }

    /**
     * Set Peak number of online members
     * @param PeakMemberNumber Peak number of online members
     */
    public void setPeakMemberNumber(Long PeakMemberNumber) {
        this.PeakMemberNumber = PeakMemberNumber;
    }

    /**
     * Get Accumulated number of online members 
     * @return MemberNumber Accumulated number of online members
     */
    public Long getMemberNumber() {
        return this.MemberNumber;
    }

    /**
     * Set Accumulated number of online members
     * @param MemberNumber Accumulated number of online members
     */
    public void setMemberNumber(Long MemberNumber) {
        this.MemberNumber = MemberNumber;
    }

    /**
     * Get Total number of records, including members who entered the room and members who should attend the class but did not 
     * @return Total Total number of records, including members who entered the room and members who should attend the class but did not
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of records, including members who entered the room and members who should attend the class but did not
     * @param Total Total number of records, including members who entered the room and members who should attend the class but did not
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Member record list 
     * @return MemberRecords Member record list
     */
    public MemberRecord [] getMemberRecords() {
        return this.MemberRecords;
    }

    /**
     * Set Member record list
     * @param MemberRecords Member record list
     */
    public void setMemberRecords(MemberRecord [] MemberRecords) {
        this.MemberRecords = MemberRecords;
    }

    /**
     * Get The actual start time of the room, in Unix timestamp, accurate to seconds. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealStartTime The actual start time of the room, in Unix timestamp, accurate to seconds. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRealStartTime() {
        return this.RealStartTime;
    }

    /**
     * Set The actual start time of the room, in Unix timestamp, accurate to seconds. Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealStartTime The actual start time of the room, in Unix timestamp, accurate to seconds. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealStartTime(Long RealStartTime) {
        this.RealStartTime = RealStartTime;
    }

    /**
     * Get The actual end time of the room, in Unix timestamp, accurate to seconds. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RealEndTime The actual end time of the room, in Unix timestamp, accurate to seconds. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRealEndTime() {
        return this.RealEndTime;
    }

    /**
     * Set The actual end time of the room, in Unix timestamp, accurate to seconds. Note: This field may return null, indicating that no valid values can be obtained.
     * @param RealEndTime The actual end time of the room, in Unix timestamp, accurate to seconds. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRealEndTime(Long RealEndTime) {
        this.RealEndTime = RealEndTime;
    }

    /**
     * Get The total message count of the room. 
     * @return MessageCount The total message count of the room.
     */
    public Long getMessageCount() {
        return this.MessageCount;
    }

    /**
     * Set The total message count of the room.
     * @param MessageCount The total message count of the room.
     */
    public void setMessageCount(Long MessageCount) {
        this.MessageCount = MessageCount;
    }

    /**
     * Get The total number of mic-on students in the room. 
     * @return MicCount The total number of mic-on students in the room.
     */
    public Long getMicCount() {
        return this.MicCount;
    }

    /**
     * Set The total number of mic-on students in the room.
     * @param MicCount The total number of mic-on students in the room.
     */
    public void setMicCount(Long MicCount) {
        this.MicCount = MicCount;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRoomStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoomStatisticsResponse(DescribeRoomStatisticsResponse source) {
        if (source.PeakMemberNumber != null) {
            this.PeakMemberNumber = new Long(source.PeakMemberNumber);
        }
        if (source.MemberNumber != null) {
            this.MemberNumber = new Long(source.MemberNumber);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.MemberRecords != null) {
            this.MemberRecords = new MemberRecord[source.MemberRecords.length];
            for (int i = 0; i < source.MemberRecords.length; i++) {
                this.MemberRecords[i] = new MemberRecord(source.MemberRecords[i]);
            }
        }
        if (source.RealStartTime != null) {
            this.RealStartTime = new Long(source.RealStartTime);
        }
        if (source.RealEndTime != null) {
            this.RealEndTime = new Long(source.RealEndTime);
        }
        if (source.MessageCount != null) {
            this.MessageCount = new Long(source.MessageCount);
        }
        if (source.MicCount != null) {
            this.MicCount = new Long(source.MicCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeakMemberNumber", this.PeakMemberNumber);
        this.setParamSimple(map, prefix + "MemberNumber", this.MemberNumber);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "MemberRecords.", this.MemberRecords);
        this.setParamSimple(map, prefix + "RealStartTime", this.RealStartTime);
        this.setParamSimple(map, prefix + "RealEndTime", this.RealEndTime);
        this.setParamSimple(map, prefix + "MessageCount", this.MessageCount);
        this.setParamSimple(map, prefix + "MicCount", this.MicCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

