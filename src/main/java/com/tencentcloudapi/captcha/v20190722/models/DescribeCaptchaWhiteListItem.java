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

public class DescribeCaptchaWhiteListItem extends AbstractModel {

    /**
    * <p>No.</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Allowlist name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Bind captcha</p>
    */
    @SerializedName("CaptchaAppid")
    @Expose
    private Long CaptchaAppid;

    /**
    * <p>ip address</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>Status. 0: Ip allowlisted; 1: cancel allowlisting</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get <p>No.</p> 
     * @return Id <p>No.</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>No.</p>
     * @param Id <p>No.</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get <p>Bind captcha</p> 
     * @return CaptchaAppid <p>Bind captcha</p>
     */
    public Long getCaptchaAppid() {
        return this.CaptchaAppid;
    }

    /**
     * Set <p>Bind captcha</p>
     * @param CaptchaAppid <p>Bind captcha</p>
     */
    public void setCaptchaAppid(Long CaptchaAppid) {
        this.CaptchaAppid = CaptchaAppid;
    }

    /**
     * Get <p>ip address</p> 
     * @return Ip <p>ip address</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>ip address</p>
     * @param Ip <p>ip address</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>Status. 0: Ip allowlisted; 1: cancel allowlisting</p> 
     * @return Status <p>Status. 0: Ip allowlisted; 1: cancel allowlisting</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status. 0: Ip allowlisted; 1: cancel allowlisting</p>
     * @param Status <p>Status. 0: Ip allowlisted; 1: cancel allowlisting</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreatedTime <p>Creation time.</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreatedTime <p>Creation time.</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdatedTime <p>Update time.</p>
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdatedTime <p>Update time.</p>
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get <p>Remarks.</p> 
     * @return Comment <p>Remarks.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Remarks.</p>
     * @param Comment <p>Remarks.</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public DescribeCaptchaWhiteListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCaptchaWhiteListItem(DescribeCaptchaWhiteListItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CaptchaAppid != null) {
            this.CaptchaAppid = new Long(source.CaptchaAppid);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CaptchaAppid", this.CaptchaAppid);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

