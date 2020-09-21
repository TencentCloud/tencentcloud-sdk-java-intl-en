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

public class OutputGroupsInfo extends AbstractModel{

    /**
    * Channel output group name, which can contain 1–32 letters, digits, and underscores and must be unique at the channel level.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Output protocol type.
Valid values: HLS, DASH, HLS_ARCHIVE, HLS_MEDIA_PACKAGE, DASH_MEDIA_PACKAGE.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Output information.
Quantity limit: [1,1] for RTMP/RTP; [1,10] for HLS/DASH.
    */
    @SerializedName("Outputs")
    @Expose
    private OutputInfo [] Outputs;

    /**
    * Relay destination address. Quantity limit: [1,2].
    */
    @SerializedName("Destinations")
    @Expose
    private DestinationInfo [] Destinations;

    /**
    * HLS protocol configuration information, which takes effect only for HLS/HLS_ARCHIVE.
    */
    @SerializedName("HlsRemuxSettings")
    @Expose
    private HlsRemuxSettingsInfo HlsRemuxSettings;

    /**
    * DASH protocol configuration information, which takes effect only for DASH/DSAH_ARCHIVE.
    */
    @SerializedName("DashRemuxSettings")
    @Expose
    private DashRemuxSettingsInfo DashRemuxSettings;

    /**
    * DRM configuration information.
    */
    @SerializedName("DrmSettings")
    @Expose
    private DrmSettingsInfo DrmSettings;

    /**
    * Configuration information of media packaging, which is required when `Type` is set to MediaPackage.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MediaPackageSettings")
    @Expose
    private MediaPackageSettingsInfo MediaPackageSettings;

    /**
     * Get Channel output group name, which can contain 1–32 letters, digits, and underscores and must be unique at the channel level. 
     * @return Name Channel output group name, which can contain 1–32 letters, digits, and underscores and must be unique at the channel level.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Channel output group name, which can contain 1–32 letters, digits, and underscores and must be unique at the channel level.
     * @param Name Channel output group name, which can contain 1–32 letters, digits, and underscores and must be unique at the channel level.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Output protocol type.
Valid values: HLS, DASH, HLS_ARCHIVE, HLS_MEDIA_PACKAGE, DASH_MEDIA_PACKAGE. 
     * @return Type Output protocol type.
Valid values: HLS, DASH, HLS_ARCHIVE, HLS_MEDIA_PACKAGE, DASH_MEDIA_PACKAGE.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Output protocol type.
Valid values: HLS, DASH, HLS_ARCHIVE, HLS_MEDIA_PACKAGE, DASH_MEDIA_PACKAGE.
     * @param Type Output protocol type.
Valid values: HLS, DASH, HLS_ARCHIVE, HLS_MEDIA_PACKAGE, DASH_MEDIA_PACKAGE.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Output information.
Quantity limit: [1,1] for RTMP/RTP; [1,10] for HLS/DASH. 
     * @return Outputs Output information.
Quantity limit: [1,1] for RTMP/RTP; [1,10] for HLS/DASH.
     */
    public OutputInfo [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set Output information.
Quantity limit: [1,1] for RTMP/RTP; [1,10] for HLS/DASH.
     * @param Outputs Output information.
Quantity limit: [1,1] for RTMP/RTP; [1,10] for HLS/DASH.
     */
    public void setOutputs(OutputInfo [] Outputs) {
        this.Outputs = Outputs;
    }

    /**
     * Get Relay destination address. Quantity limit: [1,2]. 
     * @return Destinations Relay destination address. Quantity limit: [1,2].
     */
    public DestinationInfo [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set Relay destination address. Quantity limit: [1,2].
     * @param Destinations Relay destination address. Quantity limit: [1,2].
     */
    public void setDestinations(DestinationInfo [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get HLS protocol configuration information, which takes effect only for HLS/HLS_ARCHIVE. 
     * @return HlsRemuxSettings HLS protocol configuration information, which takes effect only for HLS/HLS_ARCHIVE.
     */
    public HlsRemuxSettingsInfo getHlsRemuxSettings() {
        return this.HlsRemuxSettings;
    }

    /**
     * Set HLS protocol configuration information, which takes effect only for HLS/HLS_ARCHIVE.
     * @param HlsRemuxSettings HLS protocol configuration information, which takes effect only for HLS/HLS_ARCHIVE.
     */
    public void setHlsRemuxSettings(HlsRemuxSettingsInfo HlsRemuxSettings) {
        this.HlsRemuxSettings = HlsRemuxSettings;
    }

    /**
     * Get DASH protocol configuration information, which takes effect only for DASH/DSAH_ARCHIVE. 
     * @return DashRemuxSettings DASH protocol configuration information, which takes effect only for DASH/DSAH_ARCHIVE.
     */
    public DashRemuxSettingsInfo getDashRemuxSettings() {
        return this.DashRemuxSettings;
    }

    /**
     * Set DASH protocol configuration information, which takes effect only for DASH/DSAH_ARCHIVE.
     * @param DashRemuxSettings DASH protocol configuration information, which takes effect only for DASH/DSAH_ARCHIVE.
     */
    public void setDashRemuxSettings(DashRemuxSettingsInfo DashRemuxSettings) {
        this.DashRemuxSettings = DashRemuxSettings;
    }

    /**
     * Get DRM configuration information. 
     * @return DrmSettings DRM configuration information.
     */
    public DrmSettingsInfo getDrmSettings() {
        return this.DrmSettings;
    }

    /**
     * Set DRM configuration information.
     * @param DrmSettings DRM configuration information.
     */
    public void setDrmSettings(DrmSettingsInfo DrmSettings) {
        this.DrmSettings = DrmSettings;
    }

    /**
     * Get Configuration information of media packaging, which is required when `Type` is set to MediaPackage.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MediaPackageSettings Configuration information of media packaging, which is required when `Type` is set to MediaPackage.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaPackageSettingsInfo getMediaPackageSettings() {
        return this.MediaPackageSettings;
    }

    /**
     * Set Configuration information of media packaging, which is required when `Type` is set to MediaPackage.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MediaPackageSettings Configuration information of media packaging, which is required when `Type` is set to MediaPackage.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMediaPackageSettings(MediaPackageSettingsInfo MediaPackageSettings) {
        this.MediaPackageSettings = MediaPackageSettings;
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
        this.setParamObj(map, prefix + "DashRemuxSettings.", this.DashRemuxSettings);
        this.setParamObj(map, prefix + "DrmSettings.", this.DrmSettings);
        this.setParamObj(map, prefix + "MediaPackageSettings.", this.MediaPackageSettings);

    }
}

