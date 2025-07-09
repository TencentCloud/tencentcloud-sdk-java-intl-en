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

public class ModifyStreamPackageChannelEndpointRequest extends AbstractModel {

    /**
    * Channel ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Channel endpoint URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * New endpoint name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * New channel authentication information
    */
    @SerializedName("AuthInfo")
    @Expose
    private EndpointAuthInfo AuthInfo;

    /**
    * Endpoint protocol.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Whether to turn on the time shift function, true: on, false: off, the default is off.
    */
    @SerializedName("TimeShiftEnable")
    @Expose
    private Boolean TimeShiftEnable;

    /**
    * The number of days in the time shift window, up to 30 days. Valid when TimeShiftEnable is turned on.
    */
    @SerializedName("TimeShiftDuration")
    @Expose
    private Long TimeShiftDuration;

    /**
    * Advertising insertion function switch.
    */
    @SerializedName("SSAIEnable")
    @Expose
    private Boolean SSAIEnable;

    /**
    * Ad insertion function configuration information. Valid when SSAIEnable is turned on.
    */
    @SerializedName("SSAIInfo")
    @Expose
    private SSAIConf SSAIInfo;

    /**
    * The customer-defined url parameter is inserted into the subscript at the specified position of the Endpoint url. 
Calculation starts from the first '/' in the url path, and the subscript starts from 0, the optional range of the subscript is: [0,3].
    */
    @SerializedName("CustomUrlParamIndex")
    @Expose
    private Long CustomUrlParamIndex;

    /**
    * Customer-defined url parameters are inserted into the specified position of the Endpoint url based on the CustomUrlParamIndex.
The parameters can only contain digits, letters, underscores (_), and hyphens (-), with a length of 1 to 64 chars.
    */
    @SerializedName("CustomUrlParam")
    @Expose
    private String CustomUrlParam;

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
     * Get Channel endpoint URL 
     * @return Url Channel endpoint URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Channel endpoint URL
     * @param Url Channel endpoint URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get New endpoint name 
     * @return Name New endpoint name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set New endpoint name
     * @param Name New endpoint name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get New channel authentication information 
     * @return AuthInfo New channel authentication information
     */
    public EndpointAuthInfo getAuthInfo() {
        return this.AuthInfo;
    }

    /**
     * Set New channel authentication information
     * @param AuthInfo New channel authentication information
     */
    public void setAuthInfo(EndpointAuthInfo AuthInfo) {
        this.AuthInfo = AuthInfo;
    }

    /**
     * Get Endpoint protocol. 
     * @return Protocol Endpoint protocol.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Endpoint protocol.
     * @param Protocol Endpoint protocol.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Whether to turn on the time shift function, true: on, false: off, the default is off. 
     * @return TimeShiftEnable Whether to turn on the time shift function, true: on, false: off, the default is off.
     */
    public Boolean getTimeShiftEnable() {
        return this.TimeShiftEnable;
    }

    /**
     * Set Whether to turn on the time shift function, true: on, false: off, the default is off.
     * @param TimeShiftEnable Whether to turn on the time shift function, true: on, false: off, the default is off.
     */
    public void setTimeShiftEnable(Boolean TimeShiftEnable) {
        this.TimeShiftEnable = TimeShiftEnable;
    }

    /**
     * Get The number of days in the time shift window, up to 30 days. Valid when TimeShiftEnable is turned on. 
     * @return TimeShiftDuration The number of days in the time shift window, up to 30 days. Valid when TimeShiftEnable is turned on.
     */
    public Long getTimeShiftDuration() {
        return this.TimeShiftDuration;
    }

    /**
     * Set The number of days in the time shift window, up to 30 days. Valid when TimeShiftEnable is turned on.
     * @param TimeShiftDuration The number of days in the time shift window, up to 30 days. Valid when TimeShiftEnable is turned on.
     */
    public void setTimeShiftDuration(Long TimeShiftDuration) {
        this.TimeShiftDuration = TimeShiftDuration;
    }

    /**
     * Get Advertising insertion function switch. 
     * @return SSAIEnable Advertising insertion function switch.
     */
    public Boolean getSSAIEnable() {
        return this.SSAIEnable;
    }

    /**
     * Set Advertising insertion function switch.
     * @param SSAIEnable Advertising insertion function switch.
     */
    public void setSSAIEnable(Boolean SSAIEnable) {
        this.SSAIEnable = SSAIEnable;
    }

    /**
     * Get Ad insertion function configuration information. Valid when SSAIEnable is turned on. 
     * @return SSAIInfo Ad insertion function configuration information. Valid when SSAIEnable is turned on.
     */
    public SSAIConf getSSAIInfo() {
        return this.SSAIInfo;
    }

    /**
     * Set Ad insertion function configuration information. Valid when SSAIEnable is turned on.
     * @param SSAIInfo Ad insertion function configuration information. Valid when SSAIEnable is turned on.
     */
    public void setSSAIInfo(SSAIConf SSAIInfo) {
        this.SSAIInfo = SSAIInfo;
    }

    /**
     * Get The customer-defined url parameter is inserted into the subscript at the specified position of the Endpoint url. 
Calculation starts from the first '/' in the url path, and the subscript starts from 0, the optional range of the subscript is: [0,3]. 
     * @return CustomUrlParamIndex The customer-defined url parameter is inserted into the subscript at the specified position of the Endpoint url. 
Calculation starts from the first '/' in the url path, and the subscript starts from 0, the optional range of the subscript is: [0,3].
     */
    public Long getCustomUrlParamIndex() {
        return this.CustomUrlParamIndex;
    }

    /**
     * Set The customer-defined url parameter is inserted into the subscript at the specified position of the Endpoint url. 
Calculation starts from the first '/' in the url path, and the subscript starts from 0, the optional range of the subscript is: [0,3].
     * @param CustomUrlParamIndex The customer-defined url parameter is inserted into the subscript at the specified position of the Endpoint url. 
Calculation starts from the first '/' in the url path, and the subscript starts from 0, the optional range of the subscript is: [0,3].
     */
    public void setCustomUrlParamIndex(Long CustomUrlParamIndex) {
        this.CustomUrlParamIndex = CustomUrlParamIndex;
    }

    /**
     * Get Customer-defined url parameters are inserted into the specified position of the Endpoint url based on the CustomUrlParamIndex.
The parameters can only contain digits, letters, underscores (_), and hyphens (-), with a length of 1 to 64 chars. 
     * @return CustomUrlParam Customer-defined url parameters are inserted into the specified position of the Endpoint url based on the CustomUrlParamIndex.
The parameters can only contain digits, letters, underscores (_), and hyphens (-), with a length of 1 to 64 chars.
     */
    public String getCustomUrlParam() {
        return this.CustomUrlParam;
    }

    /**
     * Set Customer-defined url parameters are inserted into the specified position of the Endpoint url based on the CustomUrlParamIndex.
The parameters can only contain digits, letters, underscores (_), and hyphens (-), with a length of 1 to 64 chars.
     * @param CustomUrlParam Customer-defined url parameters are inserted into the specified position of the Endpoint url based on the CustomUrlParamIndex.
The parameters can only contain digits, letters, underscores (_), and hyphens (-), with a length of 1 to 64 chars.
     */
    public void setCustomUrlParam(String CustomUrlParam) {
        this.CustomUrlParam = CustomUrlParam;
    }

    public ModifyStreamPackageChannelEndpointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamPackageChannelEndpointRequest(ModifyStreamPackageChannelEndpointRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
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
        if (source.TimeShiftEnable != null) {
            this.TimeShiftEnable = new Boolean(source.TimeShiftEnable);
        }
        if (source.TimeShiftDuration != null) {
            this.TimeShiftDuration = new Long(source.TimeShiftDuration);
        }
        if (source.SSAIEnable != null) {
            this.SSAIEnable = new Boolean(source.SSAIEnable);
        }
        if (source.SSAIInfo != null) {
            this.SSAIInfo = new SSAIConf(source.SSAIInfo);
        }
        if (source.CustomUrlParamIndex != null) {
            this.CustomUrlParamIndex = new Long(source.CustomUrlParamIndex);
        }
        if (source.CustomUrlParam != null) {
            this.CustomUrlParam = new String(source.CustomUrlParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "AuthInfo.", this.AuthInfo);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "TimeShiftEnable", this.TimeShiftEnable);
        this.setParamSimple(map, prefix + "TimeShiftDuration", this.TimeShiftDuration);
        this.setParamSimple(map, prefix + "SSAIEnable", this.SSAIEnable);
        this.setParamObj(map, prefix + "SSAIInfo.", this.SSAIInfo);
        this.setParamSimple(map, prefix + "CustomUrlParamIndex", this.CustomUrlParamIndex);
        this.setParamSimple(map, prefix + "CustomUrlParam", this.CustomUrlParam);

    }
}

