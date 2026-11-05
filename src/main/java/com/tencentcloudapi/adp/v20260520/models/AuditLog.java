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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLog extends AbstractModel {

    /**
    * <p>Employee information</p>
    */
    @SerializedName("AccountInfo")
    @Expose
    private AccountInfo AccountInfo;

    /**
    * <p>Application business id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Application name</p><p>Name when the operation log is triggered</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>Operation time</p><p>Parameter format: timestamp in seconds</p>
    */
    @SerializedName("OperateTime")
    @Expose
    private String OperateTime;

    /**
    * <p>Operation type.</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>Operation object.</p>
    */
    @SerializedName("Biz")
    @Expose
    private String Biz;

    /**
    * <p>Operation content</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>Unique ID for the operation.</p>
    */
    @SerializedName("UniqueId")
    @Expose
    private String UniqueId;

    /**
     * Get <p>Employee information</p> 
     * @return AccountInfo <p>Employee information</p>
     */
    public AccountInfo getAccountInfo() {
        return this.AccountInfo;
    }

    /**
     * Set <p>Employee information</p>
     * @param AccountInfo <p>Employee information</p>
     */
    public void setAccountInfo(AccountInfo AccountInfo) {
        this.AccountInfo = AccountInfo;
    }

    /**
     * Get <p>Application business id</p> 
     * @return AppId <p>Application business id</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Application business id</p>
     * @param AppId <p>Application business id</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Application name</p><p>Name when the operation log is triggered</p> 
     * @return AppName <p>Application name</p><p>Name when the operation log is triggered</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>Application name</p><p>Name when the operation log is triggered</p>
     * @param AppName <p>Application name</p><p>Name when the operation log is triggered</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>Operation time</p><p>Parameter format: timestamp in seconds</p> 
     * @return OperateTime <p>Operation time</p><p>Parameter format: timestamp in seconds</p>
     */
    public String getOperateTime() {
        return this.OperateTime;
    }

    /**
     * Set <p>Operation time</p><p>Parameter format: timestamp in seconds</p>
     * @param OperateTime <p>Operation time</p><p>Parameter format: timestamp in seconds</p>
     */
    public void setOperateTime(String OperateTime) {
        this.OperateTime = OperateTime;
    }

    /**
     * Get <p>Operation type.</p> 
     * @return Action <p>Operation type.</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>Operation type.</p>
     * @param Action <p>Operation type.</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>Operation object.</p> 
     * @return Biz <p>Operation object.</p>
     */
    public String getBiz() {
        return this.Biz;
    }

    /**
     * Set <p>Operation object.</p>
     * @param Biz <p>Operation object.</p>
     */
    public void setBiz(String Biz) {
        this.Biz = Biz;
    }

    /**
     * Get <p>Operation content</p> 
     * @return Content <p>Operation content</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Operation content</p>
     * @param Content <p>Operation content</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>Unique ID for the operation.</p> 
     * @return UniqueId <p>Unique ID for the operation.</p>
     */
    public String getUniqueId() {
        return this.UniqueId;
    }

    /**
     * Set <p>Unique ID for the operation.</p>
     * @param UniqueId <p>Unique ID for the operation.</p>
     */
    public void setUniqueId(String UniqueId) {
        this.UniqueId = UniqueId;
    }

    public AuditLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLog(AuditLog source) {
        if (source.AccountInfo != null) {
            this.AccountInfo = new AccountInfo(source.AccountInfo);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.OperateTime != null) {
            this.OperateTime = new String(source.OperateTime);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Biz != null) {
            this.Biz = new String(source.Biz);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.UniqueId != null) {
            this.UniqueId = new String(source.UniqueId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AccountInfo.", this.AccountInfo);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "OperateTime", this.OperateTime);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Biz", this.Biz);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "UniqueId", this.UniqueId);

    }
}

