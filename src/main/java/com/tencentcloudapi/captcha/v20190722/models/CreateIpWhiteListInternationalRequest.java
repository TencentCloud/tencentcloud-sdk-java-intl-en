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

public class CreateIpWhiteListInternationalRequest extends AbstractModel {

    /**
    * <p>ip allowlist name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Captcha appid</p>
    */
    @SerializedName("CaptchaAppid")
    @Expose
    private Long CaptchaAppid;

    /**
    * <p>ip data</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>Remark information.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get <p>ip allowlist name</p> 
     * @return Name <p>ip allowlist name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>ip allowlist name</p>
     * @param Name <p>ip allowlist name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>ip data</p> 
     * @return Ip <p>ip data</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>ip data</p>
     * @param Ip <p>ip data</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>Remark information.</p> 
     * @return Comment <p>Remark information.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Remark information.</p>
     * @param Comment <p>Remark information.</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public CreateIpWhiteListInternationalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIpWhiteListInternationalRequest(CreateIpWhiteListInternationalRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CaptchaAppid != null) {
            this.CaptchaAppid = new Long(source.CaptchaAppid);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CaptchaAppid", this.CaptchaAppid);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

