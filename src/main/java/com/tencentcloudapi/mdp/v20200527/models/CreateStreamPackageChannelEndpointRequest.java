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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStreamPackageChannelEndpointRequest extends AbstractModel {

    /**
    * Channel ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Endpoint name, which must contain 1 to 32 characters and supports digits, letters, and underscores
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Authentication information
    */
    @SerializedName("AuthInfo")
    @Expose
    private EndpointAuthInfo AuthInfo;

    /**
    * Endpoint protocol type, supports HLS, DASH, CMAF (only HLS type input can create CMAF Endpoint).
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Mainifest name, default is main.
    */
    @SerializedName("Manifest")
    @Expose
    private String Manifest;

    /**
    * Whether to turn on the TimeShift function, true: on, false: off, the default is off.
    */
    @SerializedName("TimeShiftEnable")
    @Expose
    private Boolean TimeShiftEnable;

    /**
    * The number of days to look back in TimeShift, up to 30 days is supported.
    */
    @SerializedName("TimeShiftDuration")
    @Expose
    private Long TimeShiftDuration;

    /**
    * Enable DRM. This is only effective for CMAF protocol.
    */
    @SerializedName("DRMEnabled")
    @Expose
    private Boolean DRMEnabled;

    /**
    * DRM configuration information.
    */
    @SerializedName("DRMInfo")
    @Expose
    private DRMInfo DRMInfo;

    /**
     * Get Channel ID 
     * @return Id Channel ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Channel ID
     * @param Id Channel ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Endpoint name, which must contain 1 to 32 characters and supports digits, letters, and underscores 
     * @return Name Endpoint name, which must contain 1 to 32 characters and supports digits, letters, and underscores
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Endpoint name, which must contain 1 to 32 characters and supports digits, letters, and underscores
     * @param Name Endpoint name, which must contain 1 to 32 characters and supports digits, letters, and underscores
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Authentication information 
     * @return AuthInfo Authentication information
     */
    public EndpointAuthInfo getAuthInfo() {
        return this.AuthInfo;
    }

    /**
     * Set Authentication information
     * @param AuthInfo Authentication information
     */
    public void setAuthInfo(EndpointAuthInfo AuthInfo) {
        this.AuthInfo = AuthInfo;
    }

    /**
     * Get Endpoint protocol type, supports HLS, DASH, CMAF (only HLS type input can create CMAF Endpoint). 
     * @return Protocol Endpoint protocol type, supports HLS, DASH, CMAF (only HLS type input can create CMAF Endpoint).
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Endpoint protocol type, supports HLS, DASH, CMAF (only HLS type input can create CMAF Endpoint).
     * @param Protocol Endpoint protocol type, supports HLS, DASH, CMAF (only HLS type input can create CMAF Endpoint).
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Mainifest name, default is main. 
     * @return Manifest Mainifest name, default is main.
     */
    public String getManifest() {
        return this.Manifest;
    }

    /**
     * Set Mainifest name, default is main.
     * @param Manifest Mainifest name, default is main.
     */
    public void setManifest(String Manifest) {
        this.Manifest = Manifest;
    }

    /**
     * Get Whether to turn on the TimeShift function, true: on, false: off, the default is off. 
     * @return TimeShiftEnable Whether to turn on the TimeShift function, true: on, false: off, the default is off.
     */
    public Boolean getTimeShiftEnable() {
        return this.TimeShiftEnable;
    }

    /**
     * Set Whether to turn on the TimeShift function, true: on, false: off, the default is off.
     * @param TimeShiftEnable Whether to turn on the TimeShift function, true: on, false: off, the default is off.
     */
    public void setTimeShiftEnable(Boolean TimeShiftEnable) {
        this.TimeShiftEnable = TimeShiftEnable;
    }

    /**
     * Get The number of days to look back in TimeShift, up to 30 days is supported. 
     * @return TimeShiftDuration The number of days to look back in TimeShift, up to 30 days is supported.
     */
    public Long getTimeShiftDuration() {
        return this.TimeShiftDuration;
    }

    /**
     * Set The number of days to look back in TimeShift, up to 30 days is supported.
     * @param TimeShiftDuration The number of days to look back in TimeShift, up to 30 days is supported.
     */
    public void setTimeShiftDuration(Long TimeShiftDuration) {
        this.TimeShiftDuration = TimeShiftDuration;
    }

    /**
     * Get Enable DRM. This is only effective for CMAF protocol. 
     * @return DRMEnabled Enable DRM. This is only effective for CMAF protocol.
     */
    public Boolean getDRMEnabled() {
        return this.DRMEnabled;
    }

    /**
     * Set Enable DRM. This is only effective for CMAF protocol.
     * @param DRMEnabled Enable DRM. This is only effective for CMAF protocol.
     */
    public void setDRMEnabled(Boolean DRMEnabled) {
        this.DRMEnabled = DRMEnabled;
    }

    /**
     * Get DRM configuration information. 
     * @return DRMInfo DRM configuration information.
     */
    public DRMInfo getDRMInfo() {
        return this.DRMInfo;
    }

    /**
     * Set DRM configuration information.
     * @param DRMInfo DRM configuration information.
     */
    public void setDRMInfo(DRMInfo DRMInfo) {
        this.DRMInfo = DRMInfo;
    }

    public CreateStreamPackageChannelEndpointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamPackageChannelEndpointRequest(CreateStreamPackageChannelEndpointRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AuthInfo != null) {
            this.AuthInfo = new EndpointAuthInfo(source.AuthInfo);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Manifest != null) {
            this.Manifest = new String(source.Manifest);
        }
        if (source.TimeShiftEnable != null) {
            this.TimeShiftEnable = new Boolean(source.TimeShiftEnable);
        }
        if (source.TimeShiftDuration != null) {
            this.TimeShiftDuration = new Long(source.TimeShiftDuration);
        }
        if (source.DRMEnabled != null) {
            this.DRMEnabled = new Boolean(source.DRMEnabled);
        }
        if (source.DRMInfo != null) {
            this.DRMInfo = new DRMInfo(source.DRMInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "AuthInfo.", this.AuthInfo);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Manifest", this.Manifest);
        this.setParamSimple(map, prefix + "TimeShiftEnable", this.TimeShiftEnable);
        this.setParamSimple(map, prefix + "TimeShiftDuration", this.TimeShiftDuration);
        this.setParamSimple(map, prefix + "DRMEnabled", this.DRMEnabled);
        this.setParamObj(map, prefix + "DRMInfo.", this.DRMInfo);

    }
}

