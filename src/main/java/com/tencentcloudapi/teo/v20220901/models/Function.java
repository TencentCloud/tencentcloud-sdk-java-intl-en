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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Function extends AbstractModel {

    /**
    * Function ID.
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Function name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Function description.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Function content.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Default domain name of a function.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Function ID. 
     * @return FunctionId Function ID.
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set Function ID.
     * @param FunctionId Function ID.
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Function name. 
     * @return Name Function name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Function name.
     * @param Name Function name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Function description. 
     * @return Remark Function description.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Function description.
     * @param Remark Function description.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Function content. 
     * @return Content Function content.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Function content.
     * @param Content Function content.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Default domain name of a function. 
     * @return Domain Default domain name of a function.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Default domain name of a function.
     * @param Domain Default domain name of a function.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard. 
     * @return CreateTime Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     * @param CreateTime Creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard. 
     * @return UpdateTime Modification time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Modification time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     * @param UpdateTime Modification time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Function() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Function(Function source) {
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

