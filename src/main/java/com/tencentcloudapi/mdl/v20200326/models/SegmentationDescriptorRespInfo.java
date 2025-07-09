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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SegmentationDescriptorRespInfo extends AbstractModel {

    /**
    * A 32-bit unique segmentation event identifier. Only one occurrence of a given segmentation_event_id value shall be active at any one time.
    */
    @SerializedName("EventID")
    @Expose
    private Long EventID;

    /**
    * Indicates that a previously sent segmentation event, identified by segmentation_event_id, has been cancelled.
    */
    @SerializedName("EventCancelIndicator")
    @Expose
    private Long EventCancelIndicator;

    /**
    * Distribution configuration.
    */
    @SerializedName("DeliveryRestrictions")
    @Expose
    private DeliveryRestrictionsInfo DeliveryRestrictions;

    /**
    * The duration of the segment in 90kHz ticks. indicat when the segment will be over and when the next segmentation message will occur.Shall be 0 for end messages.the time signal will continue until insert a cancellation message when not specify the duration.
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * Corresponds to SCTE-35 segmentation_upid_type parameter.
    */
    @SerializedName("UPIDType")
    @Expose
    private Long UPIDType;

    /**
    * Corresponds to SCTE-35 segmentation_upid. 
    */
    @SerializedName("UPID")
    @Expose
    private String UPID;

    /**
    * Corresponds to SCTE-35 segmentation_type_id.
    */
    @SerializedName("TypeID")
    @Expose
    private Long TypeID;

    /**
    * Corresponds to SCTE-35 segment_num。This field provides support for numbering segments within a given collection of segments.
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * Corresponds to SCTE-35 segment_expected.This field provides a count of the expected number of individual segments within a collection of segments.
    */
    @SerializedName("Expected")
    @Expose
    private Long Expected;

    /**
    * Corresponds to SCTE-35 sub_segment_num.This field provides identification for a specific sub-segment within a collection of sub-segments.
    */
    @SerializedName("SubSegmentNum")
    @Expose
    private Long SubSegmentNum;

    /**
    * Corresponds to SCTE-35 sub_segments_expected.This field provides a count of the expected number of individual sub-segments within the collection of sub-segments.
    */
    @SerializedName("SubSegmentsExpected")
    @Expose
    private Long SubSegmentsExpected;

    /**
     * Get A 32-bit unique segmentation event identifier. Only one occurrence of a given segmentation_event_id value shall be active at any one time. 
     * @return EventID A 32-bit unique segmentation event identifier. Only one occurrence of a given segmentation_event_id value shall be active at any one time.
     */
    public Long getEventID() {
        return this.EventID;
    }

    /**
     * Set A 32-bit unique segmentation event identifier. Only one occurrence of a given segmentation_event_id value shall be active at any one time.
     * @param EventID A 32-bit unique segmentation event identifier. Only one occurrence of a given segmentation_event_id value shall be active at any one time.
     */
    public void setEventID(Long EventID) {
        this.EventID = EventID;
    }

    /**
     * Get Indicates that a previously sent segmentation event, identified by segmentation_event_id, has been cancelled. 
     * @return EventCancelIndicator Indicates that a previously sent segmentation event, identified by segmentation_event_id, has been cancelled.
     */
    public Long getEventCancelIndicator() {
        return this.EventCancelIndicator;
    }

    /**
     * Set Indicates that a previously sent segmentation event, identified by segmentation_event_id, has been cancelled.
     * @param EventCancelIndicator Indicates that a previously sent segmentation event, identified by segmentation_event_id, has been cancelled.
     */
    public void setEventCancelIndicator(Long EventCancelIndicator) {
        this.EventCancelIndicator = EventCancelIndicator;
    }

    /**
     * Get Distribution configuration. 
     * @return DeliveryRestrictions Distribution configuration.
     */
    public DeliveryRestrictionsInfo getDeliveryRestrictions() {
        return this.DeliveryRestrictions;
    }

    /**
     * Set Distribution configuration.
     * @param DeliveryRestrictions Distribution configuration.
     */
    public void setDeliveryRestrictions(DeliveryRestrictionsInfo DeliveryRestrictions) {
        this.DeliveryRestrictions = DeliveryRestrictions;
    }

    /**
     * Get The duration of the segment in 90kHz ticks. indicat when the segment will be over and when the next segmentation message will occur.Shall be 0 for end messages.the time signal will continue until insert a cancellation message when not specify the duration. 
     * @return Duration The duration of the segment in 90kHz ticks. indicat when the segment will be over and when the next segmentation message will occur.Shall be 0 for end messages.the time signal will continue until insert a cancellation message when not specify the duration.
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set The duration of the segment in 90kHz ticks. indicat when the segment will be over and when the next segmentation message will occur.Shall be 0 for end messages.the time signal will continue until insert a cancellation message when not specify the duration.
     * @param Duration The duration of the segment in 90kHz ticks. indicat when the segment will be over and when the next segmentation message will occur.Shall be 0 for end messages.the time signal will continue until insert a cancellation message when not specify the duration.
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Corresponds to SCTE-35 segmentation_upid_type parameter. 
     * @return UPIDType Corresponds to SCTE-35 segmentation_upid_type parameter.
     */
    public Long getUPIDType() {
        return this.UPIDType;
    }

    /**
     * Set Corresponds to SCTE-35 segmentation_upid_type parameter.
     * @param UPIDType Corresponds to SCTE-35 segmentation_upid_type parameter.
     */
    public void setUPIDType(Long UPIDType) {
        this.UPIDType = UPIDType;
    }

    /**
     * Get Corresponds to SCTE-35 segmentation_upid.  
     * @return UPID Corresponds to SCTE-35 segmentation_upid. 
     */
    public String getUPID() {
        return this.UPID;
    }

    /**
     * Set Corresponds to SCTE-35 segmentation_upid. 
     * @param UPID Corresponds to SCTE-35 segmentation_upid. 
     */
    public void setUPID(String UPID) {
        this.UPID = UPID;
    }

    /**
     * Get Corresponds to SCTE-35 segmentation_type_id. 
     * @return TypeID Corresponds to SCTE-35 segmentation_type_id.
     */
    public Long getTypeID() {
        return this.TypeID;
    }

    /**
     * Set Corresponds to SCTE-35 segmentation_type_id.
     * @param TypeID Corresponds to SCTE-35 segmentation_type_id.
     */
    public void setTypeID(Long TypeID) {
        this.TypeID = TypeID;
    }

    /**
     * Get Corresponds to SCTE-35 segment_num。This field provides support for numbering segments within a given collection of segments. 
     * @return Num Corresponds to SCTE-35 segment_num。This field provides support for numbering segments within a given collection of segments.
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set Corresponds to SCTE-35 segment_num。This field provides support for numbering segments within a given collection of segments.
     * @param Num Corresponds to SCTE-35 segment_num。This field provides support for numbering segments within a given collection of segments.
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get Corresponds to SCTE-35 segment_expected.This field provides a count of the expected number of individual segments within a collection of segments. 
     * @return Expected Corresponds to SCTE-35 segment_expected.This field provides a count of the expected number of individual segments within a collection of segments.
     */
    public Long getExpected() {
        return this.Expected;
    }

    /**
     * Set Corresponds to SCTE-35 segment_expected.This field provides a count of the expected number of individual segments within a collection of segments.
     * @param Expected Corresponds to SCTE-35 segment_expected.This field provides a count of the expected number of individual segments within a collection of segments.
     */
    public void setExpected(Long Expected) {
        this.Expected = Expected;
    }

    /**
     * Get Corresponds to SCTE-35 sub_segment_num.This field provides identification for a specific sub-segment within a collection of sub-segments. 
     * @return SubSegmentNum Corresponds to SCTE-35 sub_segment_num.This field provides identification for a specific sub-segment within a collection of sub-segments.
     */
    public Long getSubSegmentNum() {
        return this.SubSegmentNum;
    }

    /**
     * Set Corresponds to SCTE-35 sub_segment_num.This field provides identification for a specific sub-segment within a collection of sub-segments.
     * @param SubSegmentNum Corresponds to SCTE-35 sub_segment_num.This field provides identification for a specific sub-segment within a collection of sub-segments.
     */
    public void setSubSegmentNum(Long SubSegmentNum) {
        this.SubSegmentNum = SubSegmentNum;
    }

    /**
     * Get Corresponds to SCTE-35 sub_segments_expected.This field provides a count of the expected number of individual sub-segments within the collection of sub-segments. 
     * @return SubSegmentsExpected Corresponds to SCTE-35 sub_segments_expected.This field provides a count of the expected number of individual sub-segments within the collection of sub-segments.
     */
    public Long getSubSegmentsExpected() {
        return this.SubSegmentsExpected;
    }

    /**
     * Set Corresponds to SCTE-35 sub_segments_expected.This field provides a count of the expected number of individual sub-segments within the collection of sub-segments.
     * @param SubSegmentsExpected Corresponds to SCTE-35 sub_segments_expected.This field provides a count of the expected number of individual sub-segments within the collection of sub-segments.
     */
    public void setSubSegmentsExpected(Long SubSegmentsExpected) {
        this.SubSegmentsExpected = SubSegmentsExpected;
    }

    public SegmentationDescriptorRespInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SegmentationDescriptorRespInfo(SegmentationDescriptorRespInfo source) {
        if (source.EventID != null) {
            this.EventID = new Long(source.EventID);
        }
        if (source.EventCancelIndicator != null) {
            this.EventCancelIndicator = new Long(source.EventCancelIndicator);
        }
        if (source.DeliveryRestrictions != null) {
            this.DeliveryRestrictions = new DeliveryRestrictionsInfo(source.DeliveryRestrictions);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.UPIDType != null) {
            this.UPIDType = new Long(source.UPIDType);
        }
        if (source.UPID != null) {
            this.UPID = new String(source.UPID);
        }
        if (source.TypeID != null) {
            this.TypeID = new Long(source.TypeID);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.Expected != null) {
            this.Expected = new Long(source.Expected);
        }
        if (source.SubSegmentNum != null) {
            this.SubSegmentNum = new Long(source.SubSegmentNum);
        }
        if (source.SubSegmentsExpected != null) {
            this.SubSegmentsExpected = new Long(source.SubSegmentsExpected);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventID", this.EventID);
        this.setParamSimple(map, prefix + "EventCancelIndicator", this.EventCancelIndicator);
        this.setParamObj(map, prefix + "DeliveryRestrictions.", this.DeliveryRestrictions);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "UPIDType", this.UPIDType);
        this.setParamSimple(map, prefix + "UPID", this.UPID);
        this.setParamSimple(map, prefix + "TypeID", this.TypeID);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "Expected", this.Expected);
        this.setParamSimple(map, prefix + "SubSegmentNum", this.SubSegmentNum);
        this.setParamSimple(map, prefix + "SubSegmentsExpected", this.SubSegmentsExpected);

    }
}

