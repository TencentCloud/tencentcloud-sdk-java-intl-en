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

public class OutputReq extends AbstractModel {

    /**
    * Output type, distinguish HLS DASH.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The output group name can be associated with the source group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * The file name output by the channel program after scheduling.
    */
    @SerializedName("ManifestName")
    @Expose
    private String ManifestName;

    /**
    * The manifest info, used when Type is HLS.
    */
    @SerializedName("ManifestConf")
    @Expose
    private ManifestInfo ManifestConf;

    /**
    * The manifest info, used when Type is DASH.
    */
    @SerializedName("DashManifestConf")
    @Expose
    private DashManifestInfo DashManifestConf;

    /**
     * Get Output type, distinguish HLS DASH. 
     * @return Type Output type, distinguish HLS DASH.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Output type, distinguish HLS DASH.
     * @param Type Output type, distinguish HLS DASH.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The output group name can be associated with the source group name. 
     * @return GroupName The output group name can be associated with the source group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set The output group name can be associated with the source group name.
     * @param GroupName The output group name can be associated with the source group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get The file name output by the channel program after scheduling. 
     * @return ManifestName The file name output by the channel program after scheduling.
     */
    public String getManifestName() {
        return this.ManifestName;
    }

    /**
     * Set The file name output by the channel program after scheduling.
     * @param ManifestName The file name output by the channel program after scheduling.
     */
    public void setManifestName(String ManifestName) {
        this.ManifestName = ManifestName;
    }

    /**
     * Get The manifest info, used when Type is HLS. 
     * @return ManifestConf The manifest info, used when Type is HLS.
     */
    public ManifestInfo getManifestConf() {
        return this.ManifestConf;
    }

    /**
     * Set The manifest info, used when Type is HLS.
     * @param ManifestConf The manifest info, used when Type is HLS.
     */
    public void setManifestConf(ManifestInfo ManifestConf) {
        this.ManifestConf = ManifestConf;
    }

    /**
     * Get The manifest info, used when Type is DASH. 
     * @return DashManifestConf The manifest info, used when Type is DASH.
     */
    public DashManifestInfo getDashManifestConf() {
        return this.DashManifestConf;
    }

    /**
     * Set The manifest info, used when Type is DASH.
     * @param DashManifestConf The manifest info, used when Type is DASH.
     */
    public void setDashManifestConf(DashManifestInfo DashManifestConf) {
        this.DashManifestConf = DashManifestConf;
    }

    public OutputReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputReq(OutputReq source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ManifestName != null) {
            this.ManifestName = new String(source.ManifestName);
        }
        if (source.ManifestConf != null) {
            this.ManifestConf = new ManifestInfo(source.ManifestConf);
        }
        if (source.DashManifestConf != null) {
            this.DashManifestConf = new DashManifestInfo(source.DashManifestConf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ManifestName", this.ManifestName);
        this.setParamObj(map, prefix + "ManifestConf.", this.ManifestConf);
        this.setParamObj(map, prefix + "DashManifestConf.", this.DashManifestConf);

    }
}

