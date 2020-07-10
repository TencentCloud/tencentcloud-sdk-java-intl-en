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
    * 
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
    * 
    */
    @SerializedName("Outputs")
    @Expose
    private OutputInfo [] Outputs;

    /**
    * 
    */
    @SerializedName("Destinations")
    @Expose
    private DestinationInfo [] Destinations;

    /**
    * 
    */
    @SerializedName("HlsRemuxSettings")
    @Expose
    private HlsRemuxSettingsInfo HlsRemuxSettings;

    /**
    * 
    */
    @SerializedName("DashRemuxSettings")
    @Expose
    private DashRemuxSettingsInfo DashRemuxSettings;

    /**
    * 
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
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
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
     * Get  
     * @return Outputs 
     */
    public OutputInfo [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set 
     * @param Outputs 
     */
    public void setOutputs(OutputInfo [] Outputs) {
        this.Outputs = Outputs;
    }

    /**
     * Get  
     * @return Destinations 
     */
    public DestinationInfo [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set 
     * @param Destinations 
     */
    public void setDestinations(DestinationInfo [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get  
     * @return HlsRemuxSettings 
     */
    public HlsRemuxSettingsInfo getHlsRemuxSettings() {
        return this.HlsRemuxSettings;
    }

    /**
     * Set 
     * @param HlsRemuxSettings 
     */
    public void setHlsRemuxSettings(HlsRemuxSettingsInfo HlsRemuxSettings) {
        this.HlsRemuxSettings = HlsRemuxSettings;
    }

    /**
     * Get  
     * @return DashRemuxSettings 
     */
    public DashRemuxSettingsInfo getDashRemuxSettings() {
        return this.DashRemuxSettings;
    }

    /**
     * Set 
     * @param DashRemuxSettings 
     */
    public void setDashRemuxSettings(DashRemuxSettingsInfo DashRemuxSettings) {
        this.DashRemuxSettings = DashRemuxSettings;
    }

    /**
     * Get  
     * @return DrmSettings 
     */
    public DrmSettingsInfo getDrmSettings() {
        return this.DrmSettings;
    }

    /**
     * Set 
     * @param DrmSettings 
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

