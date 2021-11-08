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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamLiveOutputGroupsInfo extends AbstractModel{

    /**
    * Output group name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the channel level
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Output protocol
Valid values: `HLS`, `DASH`, `HLS_ARCHIVE`, `HLS_STREAM_PACKAGE`, `DASH_STREAM_PACKAGE`
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Output information
If the type is RTMP or RTP, only one output is allowed; if it is HLS or DASH, 1-10 outputs are allowed.
    */
    @SerializedName("Outputs")
    @Expose
    private OutputInfo [] Outputs;

    /**
    * Relay destinations. Quantity: [1, 2]
    */
    @SerializedName("Destinations")
    @Expose
    private DestinationInfo [] Destinations;

    /**
    * HLS protocol configuration information, which takes effect only for HLS/HLS_ARCHIVE outputs
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("HlsRemuxSettings")
    @Expose
    private HlsRemuxSettingsInfo HlsRemuxSettings;

    /**
    * DRM configuration information
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("DrmSettings")
    @Expose
    private DrmSettingsInfo DrmSettings;

    /**
    * DASH protocol configuration information, which takes effect only for DASH/DASH_ARCHIVE outputs
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("DashRemuxSettings")
    @Expose
    private DashRemuxSettingsInfo DashRemuxSettings;

    /**
    * StreamPackage configuration information, which is required if the output type is StreamPackage
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("StreamPackageSettings")
    @Expose
    private StreamPackageSettingsInfo StreamPackageSettings;

    /**
    * Time-shift configuration information
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("TimeShiftSettings")
    @Expose
    private TimeShiftSettingsInfo TimeShiftSettings;

    /**
     * Get Output group name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the channel level 
     * @return Name Output group name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the channel level
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Output group name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the channel level
     * @param Name Output group name, which can contain 1-32 case-sensitive letters, digits, and underscores and must be unique at the channel level
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Output protocol
Valid values: `HLS`, `DASH`, `HLS_ARCHIVE`, `HLS_STREAM_PACKAGE`, `DASH_STREAM_PACKAGE` 
     * @return Type Output protocol
Valid values: `HLS`, `DASH`, `HLS_ARCHIVE`, `HLS_STREAM_PACKAGE`, `DASH_STREAM_PACKAGE`
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Output protocol
Valid values: `HLS`, `DASH`, `HLS_ARCHIVE`, `HLS_STREAM_PACKAGE`, `DASH_STREAM_PACKAGE`
     * @param Type Output protocol
Valid values: `HLS`, `DASH`, `HLS_ARCHIVE`, `HLS_STREAM_PACKAGE`, `DASH_STREAM_PACKAGE`
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Output information
If the type is RTMP or RTP, only one output is allowed; if it is HLS or DASH, 1-10 outputs are allowed. 
     * @return Outputs Output information
If the type is RTMP or RTP, only one output is allowed; if it is HLS or DASH, 1-10 outputs are allowed.
     */
    public OutputInfo [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set Output information
If the type is RTMP or RTP, only one output is allowed; if it is HLS or DASH, 1-10 outputs are allowed.
     * @param Outputs Output information
If the type is RTMP or RTP, only one output is allowed; if it is HLS or DASH, 1-10 outputs are allowed.
     */
    public void setOutputs(OutputInfo [] Outputs) {
        this.Outputs = Outputs;
    }

    /**
     * Get Relay destinations. Quantity: [1, 2] 
     * @return Destinations Relay destinations. Quantity: [1, 2]
     */
    public DestinationInfo [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set Relay destinations. Quantity: [1, 2]
     * @param Destinations Relay destinations. Quantity: [1, 2]
     */
    public void setDestinations(DestinationInfo [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get HLS protocol configuration information, which takes effect only for HLS/HLS_ARCHIVE outputs
Note: this field may return `null`, indicating that no valid value was found. 
     * @return HlsRemuxSettings HLS protocol configuration information, which takes effect only for HLS/HLS_ARCHIVE outputs
Note: this field may return `null`, indicating that no valid value was found.
     */
    public HlsRemuxSettingsInfo getHlsRemuxSettings() {
        return this.HlsRemuxSettings;
    }

    /**
     * Set HLS protocol configuration information, which takes effect only for HLS/HLS_ARCHIVE outputs
Note: this field may return `null`, indicating that no valid value was found.
     * @param HlsRemuxSettings HLS protocol configuration information, which takes effect only for HLS/HLS_ARCHIVE outputs
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setHlsRemuxSettings(HlsRemuxSettingsInfo HlsRemuxSettings) {
        this.HlsRemuxSettings = HlsRemuxSettings;
    }

    /**
     * Get DRM configuration information
Note: this field may return `null`, indicating that no valid value was found. 
     * @return DrmSettings DRM configuration information
Note: this field may return `null`, indicating that no valid value was found.
     */
    public DrmSettingsInfo getDrmSettings() {
        return this.DrmSettings;
    }

    /**
     * Set DRM configuration information
Note: this field may return `null`, indicating that no valid value was found.
     * @param DrmSettings DRM configuration information
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setDrmSettings(DrmSettingsInfo DrmSettings) {
        this.DrmSettings = DrmSettings;
    }

    /**
     * Get DASH protocol configuration information, which takes effect only for DASH/DASH_ARCHIVE outputs
Note: this field may return `null`, indicating that no valid value was found. 
     * @return DashRemuxSettings DASH protocol configuration information, which takes effect only for DASH/DASH_ARCHIVE outputs
Note: this field may return `null`, indicating that no valid value was found.
     */
    public DashRemuxSettingsInfo getDashRemuxSettings() {
        return this.DashRemuxSettings;
    }

    /**
     * Set DASH protocol configuration information, which takes effect only for DASH/DASH_ARCHIVE outputs
Note: this field may return `null`, indicating that no valid value was found.
     * @param DashRemuxSettings DASH protocol configuration information, which takes effect only for DASH/DASH_ARCHIVE outputs
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setDashRemuxSettings(DashRemuxSettingsInfo DashRemuxSettings) {
        this.DashRemuxSettings = DashRemuxSettings;
    }

    /**
     * Get StreamPackage configuration information, which is required if the output type is StreamPackage
Note: this field may return `null`, indicating that no valid value was found. 
     * @return StreamPackageSettings StreamPackage configuration information, which is required if the output type is StreamPackage
Note: this field may return `null`, indicating that no valid value was found.
     */
    public StreamPackageSettingsInfo getStreamPackageSettings() {
        return this.StreamPackageSettings;
    }

    /**
     * Set StreamPackage configuration information, which is required if the output type is StreamPackage
Note: this field may return `null`, indicating that no valid value was found.
     * @param StreamPackageSettings StreamPackage configuration information, which is required if the output type is StreamPackage
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setStreamPackageSettings(StreamPackageSettingsInfo StreamPackageSettings) {
        this.StreamPackageSettings = StreamPackageSettings;
    }

    /**
     * Get Time-shift configuration information
Note: This field may return `null`, indicating that no valid value was found. 
     * @return TimeShiftSettings Time-shift configuration information
Note: This field may return `null`, indicating that no valid value was found.
     */
    public TimeShiftSettingsInfo getTimeShiftSettings() {
        return this.TimeShiftSettings;
    }

    /**
     * Set Time-shift configuration information
Note: This field may return `null`, indicating that no valid value was found.
     * @param TimeShiftSettings Time-shift configuration information
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTimeShiftSettings(TimeShiftSettingsInfo TimeShiftSettings) {
        this.TimeShiftSettings = TimeShiftSettings;
    }

    public StreamLiveOutputGroupsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamLiveOutputGroupsInfo(StreamLiveOutputGroupsInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Outputs != null) {
            this.Outputs = new OutputInfo[source.Outputs.length];
            for (int i = 0; i < source.Outputs.length; i++) {
                this.Outputs[i] = new OutputInfo(source.Outputs[i]);
            }
        }
        if (source.Destinations != null) {
            this.Destinations = new DestinationInfo[source.Destinations.length];
            for (int i = 0; i < source.Destinations.length; i++) {
                this.Destinations[i] = new DestinationInfo(source.Destinations[i]);
            }
        }
        if (source.HlsRemuxSettings != null) {
            this.HlsRemuxSettings = new HlsRemuxSettingsInfo(source.HlsRemuxSettings);
        }
        if (source.DrmSettings != null) {
            this.DrmSettings = new DrmSettingsInfo(source.DrmSettings);
        }
        if (source.DashRemuxSettings != null) {
            this.DashRemuxSettings = new DashRemuxSettingsInfo(source.DashRemuxSettings);
        }
        if (source.StreamPackageSettings != null) {
            this.StreamPackageSettings = new StreamPackageSettingsInfo(source.StreamPackageSettings);
        }
        if (source.TimeShiftSettings != null) {
            this.TimeShiftSettings = new TimeShiftSettingsInfo(source.TimeShiftSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);
        this.setParamArrayObj(map, prefix + "Destinations.", this.Destinations);
        this.setParamObj(map, prefix + "HlsRemuxSettings.", this.HlsRemuxSettings);
        this.setParamObj(map, prefix + "DrmSettings.", this.DrmSettings);
        this.setParamObj(map, prefix + "DashRemuxSettings.", this.DashRemuxSettings);
        this.setParamObj(map, prefix + "StreamPackageSettings.", this.StreamPackageSettings);
        this.setParamObj(map, prefix + "TimeShiftSettings.", this.TimeShiftSettings);

    }
}

