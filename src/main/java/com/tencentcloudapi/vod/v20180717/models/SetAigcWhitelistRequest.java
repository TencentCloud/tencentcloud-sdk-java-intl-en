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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetAigcWhitelistRequest extends AbstractModel {

    /**
    * <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD after December 25, 2023, this field must be set to the application ID when accessing resources in a VOD application (whether the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>AIGC task type</p><p>Valid values:</p><ul><li>Image: AIGC image generation task</li><li>Video: AIGC video generation task</li></ul>
    */
    @SerializedName("AigcType")
    @Expose
    private String AigcType;

    /**
    * <p>Model allowlist switch</p><p>Valid values:</p><ul><li>ON: Enabled. Only models listed in ModelWhitelist can be called.</li><li>OFF: Disabled. All models can be called.</li></ul>
    */
    @SerializedName("ModelWhitelistSwitch")
    @Expose
    private String ModelWhitelistSwitch;

    /**
    * <p>IP allowlist switch</p><p>Valid values:</p><ul><li>ON: Enabled. Only IP ranges listed in IpWhitelist are allowed to call.</li><li>OFF: Disabled. All IPs are allowed to call.</li></ul>
    */
    @SerializedName("IpWhitelistSwitch")
    @Expose
    private String IpWhitelistSwitch;

    /**
    * <p>Model allowlist</p>
    */
    @SerializedName("ModelWhitelist")
    @Expose
    private AigcWhitelistModel [] ModelWhitelist;

    /**
    * <p>CIDR list of the IP allowlist</p>
    */
    @SerializedName("IpWhitelist")
    @Expose
    private String [] IpWhitelist;

    /**
     * Get <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD after December 25, 2023, this field must be set to the application ID when accessing resources in a VOD application (whether the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD after December 25, 2023, this field must be set to the application ID when accessing resources in a VOD application (whether the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD after December 25, 2023, this field must be set to the application ID when accessing resources in a VOD application (whether the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>VOD <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD after December 25, 2023, this field must be set to the application ID when accessing resources in a VOD application (whether the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>AIGC task type</p><p>Valid values:</p><ul><li>Image: AIGC image generation task</li><li>Video: AIGC video generation task</li></ul> 
     * @return AigcType <p>AIGC task type</p><p>Valid values:</p><ul><li>Image: AIGC image generation task</li><li>Video: AIGC video generation task</li></ul>
     */
    public String getAigcType() {
        return this.AigcType;
    }

    /**
     * Set <p>AIGC task type</p><p>Valid values:</p><ul><li>Image: AIGC image generation task</li><li>Video: AIGC video generation task</li></ul>
     * @param AigcType <p>AIGC task type</p><p>Valid values:</p><ul><li>Image: AIGC image generation task</li><li>Video: AIGC video generation task</li></ul>
     */
    public void setAigcType(String AigcType) {
        this.AigcType = AigcType;
    }

    /**
     * Get <p>Model allowlist switch</p><p>Valid values:</p><ul><li>ON: Enabled. Only models listed in ModelWhitelist can be called.</li><li>OFF: Disabled. All models can be called.</li></ul> 
     * @return ModelWhitelistSwitch <p>Model allowlist switch</p><p>Valid values:</p><ul><li>ON: Enabled. Only models listed in ModelWhitelist can be called.</li><li>OFF: Disabled. All models can be called.</li></ul>
     */
    public String getModelWhitelistSwitch() {
        return this.ModelWhitelistSwitch;
    }

    /**
     * Set <p>Model allowlist switch</p><p>Valid values:</p><ul><li>ON: Enabled. Only models listed in ModelWhitelist can be called.</li><li>OFF: Disabled. All models can be called.</li></ul>
     * @param ModelWhitelistSwitch <p>Model allowlist switch</p><p>Valid values:</p><ul><li>ON: Enabled. Only models listed in ModelWhitelist can be called.</li><li>OFF: Disabled. All models can be called.</li></ul>
     */
    public void setModelWhitelistSwitch(String ModelWhitelistSwitch) {
        this.ModelWhitelistSwitch = ModelWhitelistSwitch;
    }

    /**
     * Get <p>IP allowlist switch</p><p>Valid values:</p><ul><li>ON: Enabled. Only IP ranges listed in IpWhitelist are allowed to call.</li><li>OFF: Disabled. All IPs are allowed to call.</li></ul> 
     * @return IpWhitelistSwitch <p>IP allowlist switch</p><p>Valid values:</p><ul><li>ON: Enabled. Only IP ranges listed in IpWhitelist are allowed to call.</li><li>OFF: Disabled. All IPs are allowed to call.</li></ul>
     */
    public String getIpWhitelistSwitch() {
        return this.IpWhitelistSwitch;
    }

    /**
     * Set <p>IP allowlist switch</p><p>Valid values:</p><ul><li>ON: Enabled. Only IP ranges listed in IpWhitelist are allowed to call.</li><li>OFF: Disabled. All IPs are allowed to call.</li></ul>
     * @param IpWhitelistSwitch <p>IP allowlist switch</p><p>Valid values:</p><ul><li>ON: Enabled. Only IP ranges listed in IpWhitelist are allowed to call.</li><li>OFF: Disabled. All IPs are allowed to call.</li></ul>
     */
    public void setIpWhitelistSwitch(String IpWhitelistSwitch) {
        this.IpWhitelistSwitch = IpWhitelistSwitch;
    }

    /**
     * Get <p>Model allowlist</p> 
     * @return ModelWhitelist <p>Model allowlist</p>
     */
    public AigcWhitelistModel [] getModelWhitelist() {
        return this.ModelWhitelist;
    }

    /**
     * Set <p>Model allowlist</p>
     * @param ModelWhitelist <p>Model allowlist</p>
     */
    public void setModelWhitelist(AigcWhitelistModel [] ModelWhitelist) {
        this.ModelWhitelist = ModelWhitelist;
    }

    /**
     * Get <p>CIDR list of the IP allowlist</p> 
     * @return IpWhitelist <p>CIDR list of the IP allowlist</p>
     */
    public String [] getIpWhitelist() {
        return this.IpWhitelist;
    }

    /**
     * Set <p>CIDR list of the IP allowlist</p>
     * @param IpWhitelist <p>CIDR list of the IP allowlist</p>
     */
    public void setIpWhitelist(String [] IpWhitelist) {
        this.IpWhitelist = IpWhitelist;
    }

    public SetAigcWhitelistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetAigcWhitelistRequest(SetAigcWhitelistRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.AigcType != null) {
            this.AigcType = new String(source.AigcType);
        }
        if (source.ModelWhitelistSwitch != null) {
            this.ModelWhitelistSwitch = new String(source.ModelWhitelistSwitch);
        }
        if (source.IpWhitelistSwitch != null) {
            this.IpWhitelistSwitch = new String(source.IpWhitelistSwitch);
        }
        if (source.ModelWhitelist != null) {
            this.ModelWhitelist = new AigcWhitelistModel[source.ModelWhitelist.length];
            for (int i = 0; i < source.ModelWhitelist.length; i++) {
                this.ModelWhitelist[i] = new AigcWhitelistModel(source.ModelWhitelist[i]);
            }
        }
        if (source.IpWhitelist != null) {
            this.IpWhitelist = new String[source.IpWhitelist.length];
            for (int i = 0; i < source.IpWhitelist.length; i++) {
                this.IpWhitelist[i] = new String(source.IpWhitelist[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "AigcType", this.AigcType);
        this.setParamSimple(map, prefix + "ModelWhitelistSwitch", this.ModelWhitelistSwitch);
        this.setParamSimple(map, prefix + "IpWhitelistSwitch", this.IpWhitelistSwitch);
        this.setParamArrayObj(map, prefix + "ModelWhitelist.", this.ModelWhitelist);
        this.setParamArraySimple(map, prefix + "IpWhitelist.", this.IpWhitelist);

    }
}

