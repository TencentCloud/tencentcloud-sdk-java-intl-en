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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpWhiteListInternationalRequest extends AbstractModel {

    /**
    * <p>Page number.</p>
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * <p>Page length.</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Captcha appid</p>
    */
    @SerializedName("CaptchaAppid")
    @Expose
    private Long CaptchaAppid;

    /**
    * <p>Allowlist name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Ip address</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>IP Whitelist Configuration Status</p><p>Enumeration values:</p><ul><li>0: all</li><li>1: allowlisted</li><li>2: allowlisting canceled</li></ul><p>Default value: 0</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>Page number.</p> 
     * @return PageIndex <p>Page number.</p>
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set <p>Page number.</p>
     * @param PageIndex <p>Page number.</p>
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get <p>Page length.</p> 
     * @return PageSize <p>Page length.</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Page length.</p>
     * @param PageSize <p>Page length.</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Captcha appid</p> 
     * @return CaptchaAppid <p>Captcha appid</p>
     */
    public Long getCaptchaAppid() {
        return this.CaptchaAppid;
    }

    /**
     * Set <p>Captcha appid</p>
     * @param CaptchaAppid <p>Captcha appid</p>
     */
    public void setCaptchaAppid(Long CaptchaAppid) {
        this.CaptchaAppid = CaptchaAppid;
    }

    /**
     * Get <p>Allowlist name</p> 
     * @return Name <p>Allowlist name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Allowlist name</p>
     * @param Name <p>Allowlist name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Ip address</p> 
     * @return Ip <p>Ip address</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>Ip address</p>
     * @param Ip <p>Ip address</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>IP Whitelist Configuration Status</p><p>Enumeration values:</p><ul><li>0: all</li><li>1: allowlisted</li><li>2: allowlisting canceled</li></ul><p>Default value: 0</p> 
     * @return Status <p>IP Whitelist Configuration Status</p><p>Enumeration values:</p><ul><li>0: all</li><li>1: allowlisted</li><li>2: allowlisting canceled</li></ul><p>Default value: 0</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>IP Whitelist Configuration Status</p><p>Enumeration values:</p><ul><li>0: all</li><li>1: allowlisted</li><li>2: allowlisting canceled</li></ul><p>Default value: 0</p>
     * @param Status <p>IP Whitelist Configuration Status</p><p>Enumeration values:</p><ul><li>0: all</li><li>1: allowlisted</li><li>2: allowlisting canceled</li></ul><p>Default value: 0</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public DescribeIpWhiteListInternationalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIpWhiteListInternationalRequest(DescribeIpWhiteListInternationalRequest source) {
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.CaptchaAppid != null) {
            this.CaptchaAppid = new Long(source.CaptchaAppid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "CaptchaAppid", this.CaptchaAppid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

