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

public class EventSettingsResp extends AbstractModel {

    /**
    * Valid values: `INPUT_SWITCH`, `TIMED_RECORD`, `SCTE35_TIME_SIGNAL`, `SCTE35_SPLICE_INSERT`, `SCTE35_RETURN_TO_NETWORK`, `STATIC_IMAGE_ACTIVATE`, `STATIC_IMAGE_DEACTIVATE`.
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * ID of the input attached, which is not empty if `EventType` is `INPUT_SWITCH`
    */
    @SerializedName("InputAttachment")
    @Expose
    private String InputAttachment;

    /**
    * Name of the output group attached. This parameter is not empty if `EventType` is `TIMED_RECORD`.
    */
    @SerializedName("OutputGroupName")
    @Expose
    private String OutputGroupName;

    /**
    * Name of the manifest file for timed recording, which ends with `.m3u8` for HLS and `.mpd` for DASH. This parameter is not empty if `EventType` is `TIMED_RECORD`.
    */
    @SerializedName("ManifestName")
    @Expose
    private String ManifestName;

    /**
    * URL of the COS bucket where recording files are saved. This parameter is not empty if `EventType` is `TIMED_RECORD`. It may contain 1 or 2 URLs. The first URL corresponds to pipeline 0 and the second pipeline 1.
    */
    @SerializedName("Destinations")
    @Expose
    private EventSettingsDestinationResp [] Destinations;

    /**
    * SCTE-35 configuration information.
    */
    @SerializedName("SCTE35SegmentationDescriptor")
    @Expose
    private SegmentationDescriptorRespInfo [] SCTE35SegmentationDescriptor;

    /**
    * A 32-bit unique segmentation event identifier.Only one occurrence of a given segmentation_event_id value shall be active at any one time.
    */
    @SerializedName("SpliceEventID")
    @Expose
    private Long SpliceEventID;

    /**
    * The duration of the segment in 90kHz ticks.It used to  give the splicer an indication of when the break will be over and when the network In Point will occur. If not specifyed,the splice_insert will continue when enter a return_to_network to end the splice_insert at the appropriate time.
    */
    @SerializedName("SpliceDuration")
    @Expose
    private String SpliceDuration;

    /**
    * Meta information plan configuration.
    */
    @SerializedName("TimedMetadataSetting")
    @Expose
    private TimedMetadataInfo TimedMetadataSetting;

    /**
    * Static image activate setting.
    */
    @SerializedName("StaticImageActivateSetting")
    @Expose
    private StaticImageActivateSetting StaticImageActivateSetting;

    /**
    * Static image deactivate setting.
    */
    @SerializedName("StaticImageDeactivateSetting")
    @Expose
    private StaticImageDeactivateSetting StaticImageDeactivateSetting;

    /**
    * Dynamic graphic overlay activate configuration.
    */
    @SerializedName("MotionGraphicsActivateSetting")
    @Expose
    private MotionGraphicsActivateSetting MotionGraphicsActivateSetting;

    /**
     * Get Valid values: `INPUT_SWITCH`, `TIMED_RECORD`, `SCTE35_TIME_SIGNAL`, `SCTE35_SPLICE_INSERT`, `SCTE35_RETURN_TO_NETWORK`, `STATIC_IMAGE_ACTIVATE`, `STATIC_IMAGE_DEACTIVATE`. 
     * @return EventType Valid values: `INPUT_SWITCH`, `TIMED_RECORD`, `SCTE35_TIME_SIGNAL`, `SCTE35_SPLICE_INSERT`, `SCTE35_RETURN_TO_NETWORK`, `STATIC_IMAGE_ACTIVATE`, `STATIC_IMAGE_DEACTIVATE`.
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Valid values: `INPUT_SWITCH`, `TIMED_RECORD`, `SCTE35_TIME_SIGNAL`, `SCTE35_SPLICE_INSERT`, `SCTE35_RETURN_TO_NETWORK`, `STATIC_IMAGE_ACTIVATE`, `STATIC_IMAGE_DEACTIVATE`.
     * @param EventType Valid values: `INPUT_SWITCH`, `TIMED_RECORD`, `SCTE35_TIME_SIGNAL`, `SCTE35_SPLICE_INSERT`, `SCTE35_RETURN_TO_NETWORK`, `STATIC_IMAGE_ACTIVATE`, `STATIC_IMAGE_DEACTIVATE`.
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get ID of the input attached, which is not empty if `EventType` is `INPUT_SWITCH` 
     * @return InputAttachment ID of the input attached, which is not empty if `EventType` is `INPUT_SWITCH`
     */
    public String getInputAttachment() {
        return this.InputAttachment;
    }

    /**
     * Set ID of the input attached, which is not empty if `EventType` is `INPUT_SWITCH`
     * @param InputAttachment ID of the input attached, which is not empty if `EventType` is `INPUT_SWITCH`
     */
    public void setInputAttachment(String InputAttachment) {
        this.InputAttachment = InputAttachment;
    }

    /**
     * Get Name of the output group attached. This parameter is not empty if `EventType` is `TIMED_RECORD`. 
     * @return OutputGroupName Name of the output group attached. This parameter is not empty if `EventType` is `TIMED_RECORD`.
     */
    public String getOutputGroupName() {
        return this.OutputGroupName;
    }

    /**
     * Set Name of the output group attached. This parameter is not empty if `EventType` is `TIMED_RECORD`.
     * @param OutputGroupName Name of the output group attached. This parameter is not empty if `EventType` is `TIMED_RECORD`.
     */
    public void setOutputGroupName(String OutputGroupName) {
        this.OutputGroupName = OutputGroupName;
    }

    /**
     * Get Name of the manifest file for timed recording, which ends with `.m3u8` for HLS and `.mpd` for DASH. This parameter is not empty if `EventType` is `TIMED_RECORD`. 
     * @return ManifestName Name of the manifest file for timed recording, which ends with `.m3u8` for HLS and `.mpd` for DASH. This parameter is not empty if `EventType` is `TIMED_RECORD`.
     */
    public String getManifestName() {
        return this.ManifestName;
    }

    /**
     * Set Name of the manifest file for timed recording, which ends with `.m3u8` for HLS and `.mpd` for DASH. This parameter is not empty if `EventType` is `TIMED_RECORD`.
     * @param ManifestName Name of the manifest file for timed recording, which ends with `.m3u8` for HLS and `.mpd` for DASH. This parameter is not empty if `EventType` is `TIMED_RECORD`.
     */
    public void setManifestName(String ManifestName) {
        this.ManifestName = ManifestName;
    }

    /**
     * Get URL of the COS bucket where recording files are saved. This parameter is not empty if `EventType` is `TIMED_RECORD`. It may contain 1 or 2 URLs. The first URL corresponds to pipeline 0 and the second pipeline 1. 
     * @return Destinations URL of the COS bucket where recording files are saved. This parameter is not empty if `EventType` is `TIMED_RECORD`. It may contain 1 or 2 URLs. The first URL corresponds to pipeline 0 and the second pipeline 1.
     */
    public EventSettingsDestinationResp [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set URL of the COS bucket where recording files are saved. This parameter is not empty if `EventType` is `TIMED_RECORD`. It may contain 1 or 2 URLs. The first URL corresponds to pipeline 0 and the second pipeline 1.
     * @param Destinations URL of the COS bucket where recording files are saved. This parameter is not empty if `EventType` is `TIMED_RECORD`. It may contain 1 or 2 URLs. The first URL corresponds to pipeline 0 and the second pipeline 1.
     */
    public void setDestinations(EventSettingsDestinationResp [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get SCTE-35 configuration information. 
     * @return SCTE35SegmentationDescriptor SCTE-35 configuration information.
     */
    public SegmentationDescriptorRespInfo [] getSCTE35SegmentationDescriptor() {
        return this.SCTE35SegmentationDescriptor;
    }

    /**
     * Set SCTE-35 configuration information.
     * @param SCTE35SegmentationDescriptor SCTE-35 configuration information.
     */
    public void setSCTE35SegmentationDescriptor(SegmentationDescriptorRespInfo [] SCTE35SegmentationDescriptor) {
        this.SCTE35SegmentationDescriptor = SCTE35SegmentationDescriptor;
    }

    /**
     * Get A 32-bit unique segmentation event identifier.Only one occurrence of a given segmentation_event_id value shall be active at any one time. 
     * @return SpliceEventID A 32-bit unique segmentation event identifier.Only one occurrence of a given segmentation_event_id value shall be active at any one time.
     */
    public Long getSpliceEventID() {
        return this.SpliceEventID;
    }

    /**
     * Set A 32-bit unique segmentation event identifier.Only one occurrence of a given segmentation_event_id value shall be active at any one time.
     * @param SpliceEventID A 32-bit unique segmentation event identifier.Only one occurrence of a given segmentation_event_id value shall be active at any one time.
     */
    public void setSpliceEventID(Long SpliceEventID) {
        this.SpliceEventID = SpliceEventID;
    }

    /**
     * Get The duration of the segment in 90kHz ticks.It used to  give the splicer an indication of when the break will be over and when the network In Point will occur. If not specifyed,the splice_insert will continue when enter a return_to_network to end the splice_insert at the appropriate time. 
     * @return SpliceDuration The duration of the segment in 90kHz ticks.It used to  give the splicer an indication of when the break will be over and when the network In Point will occur. If not specifyed,the splice_insert will continue when enter a return_to_network to end the splice_insert at the appropriate time.
     */
    public String getSpliceDuration() {
        return this.SpliceDuration;
    }

    /**
     * Set The duration of the segment in 90kHz ticks.It used to  give the splicer an indication of when the break will be over and when the network In Point will occur. If not specifyed,the splice_insert will continue when enter a return_to_network to end the splice_insert at the appropriate time.
     * @param SpliceDuration The duration of the segment in 90kHz ticks.It used to  give the splicer an indication of when the break will be over and when the network In Point will occur. If not specifyed,the splice_insert will continue when enter a return_to_network to end the splice_insert at the appropriate time.
     */
    public void setSpliceDuration(String SpliceDuration) {
        this.SpliceDuration = SpliceDuration;
    }

    /**
     * Get Meta information plan configuration. 
     * @return TimedMetadataSetting Meta information plan configuration.
     */
    public TimedMetadataInfo getTimedMetadataSetting() {
        return this.TimedMetadataSetting;
    }

    /**
     * Set Meta information plan configuration.
     * @param TimedMetadataSetting Meta information plan configuration.
     */
    public void setTimedMetadataSetting(TimedMetadataInfo TimedMetadataSetting) {
        this.TimedMetadataSetting = TimedMetadataSetting;
    }

    /**
     * Get Static image activate setting. 
     * @return StaticImageActivateSetting Static image activate setting.
     */
    public StaticImageActivateSetting getStaticImageActivateSetting() {
        return this.StaticImageActivateSetting;
    }

    /**
     * Set Static image activate setting.
     * @param StaticImageActivateSetting Static image activate setting.
     */
    public void setStaticImageActivateSetting(StaticImageActivateSetting StaticImageActivateSetting) {
        this.StaticImageActivateSetting = StaticImageActivateSetting;
    }

    /**
     * Get Static image deactivate setting. 
     * @return StaticImageDeactivateSetting Static image deactivate setting.
     */
    public StaticImageDeactivateSetting getStaticImageDeactivateSetting() {
        return this.StaticImageDeactivateSetting;
    }

    /**
     * Set Static image deactivate setting.
     * @param StaticImageDeactivateSetting Static image deactivate setting.
     */
    public void setStaticImageDeactivateSetting(StaticImageDeactivateSetting StaticImageDeactivateSetting) {
        this.StaticImageDeactivateSetting = StaticImageDeactivateSetting;
    }

    /**
     * Get Dynamic graphic overlay activate configuration. 
     * @return MotionGraphicsActivateSetting Dynamic graphic overlay activate configuration.
     */
    public MotionGraphicsActivateSetting getMotionGraphicsActivateSetting() {
        return this.MotionGraphicsActivateSetting;
    }

    /**
     * Set Dynamic graphic overlay activate configuration.
     * @param MotionGraphicsActivateSetting Dynamic graphic overlay activate configuration.
     */
    public void setMotionGraphicsActivateSetting(MotionGraphicsActivateSetting MotionGraphicsActivateSetting) {
        this.MotionGraphicsActivateSetting = MotionGraphicsActivateSetting;
    }

    public EventSettingsResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventSettingsResp(EventSettingsResp source) {
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.InputAttachment != null) {
            this.InputAttachment = new String(source.InputAttachment);
        }
        if (source.OutputGroupName != null) {
            this.OutputGroupName = new String(source.OutputGroupName);
        }
        if (source.ManifestName != null) {
            this.ManifestName = new String(source.ManifestName);
        }
        if (source.Destinations != null) {
            this.Destinations = new EventSettingsDestinationResp[source.Destinations.length];
            for (int i = 0; i < source.Destinations.length; i++) {
                this.Destinations[i] = new EventSettingsDestinationResp(source.Destinations[i]);
            }
        }
        if (source.SCTE35SegmentationDescriptor != null) {
            this.SCTE35SegmentationDescriptor = new SegmentationDescriptorRespInfo[source.SCTE35SegmentationDescriptor.length];
            for (int i = 0; i < source.SCTE35SegmentationDescriptor.length; i++) {
                this.SCTE35SegmentationDescriptor[i] = new SegmentationDescriptorRespInfo(source.SCTE35SegmentationDescriptor[i]);
            }
        }
        if (source.SpliceEventID != null) {
            this.SpliceEventID = new Long(source.SpliceEventID);
        }
        if (source.SpliceDuration != null) {
            this.SpliceDuration = new String(source.SpliceDuration);
        }
        if (source.TimedMetadataSetting != null) {
            this.TimedMetadataSetting = new TimedMetadataInfo(source.TimedMetadataSetting);
        }
        if (source.StaticImageActivateSetting != null) {
            this.StaticImageActivateSetting = new StaticImageActivateSetting(source.StaticImageActivateSetting);
        }
        if (source.StaticImageDeactivateSetting != null) {
            this.StaticImageDeactivateSetting = new StaticImageDeactivateSetting(source.StaticImageDeactivateSetting);
        }
        if (source.MotionGraphicsActivateSetting != null) {
            this.MotionGraphicsActivateSetting = new MotionGraphicsActivateSetting(source.MotionGraphicsActivateSetting);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "InputAttachment", this.InputAttachment);
        this.setParamSimple(map, prefix + "OutputGroupName", this.OutputGroupName);
        this.setParamSimple(map, prefix + "ManifestName", this.ManifestName);
        this.setParamArrayObj(map, prefix + "Destinations.", this.Destinations);
        this.setParamArrayObj(map, prefix + "SCTE35SegmentationDescriptor.", this.SCTE35SegmentationDescriptor);
        this.setParamSimple(map, prefix + "SpliceEventID", this.SpliceEventID);
        this.setParamSimple(map, prefix + "SpliceDuration", this.SpliceDuration);
        this.setParamObj(map, prefix + "TimedMetadataSetting.", this.TimedMetadataSetting);
        this.setParamObj(map, prefix + "StaticImageActivateSetting.", this.StaticImageActivateSetting);
        this.setParamObj(map, prefix + "StaticImageDeactivateSetting.", this.StaticImageDeactivateSetting);
        this.setParamObj(map, prefix + "MotionGraphicsActivateSetting.", this.MotionGraphicsActivateSetting);

    }
}

