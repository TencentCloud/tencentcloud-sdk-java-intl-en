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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NewAlertKey extends AbstractModel {

    /**
    * User AppID to Be Changed
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Alarm category
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Alarm Subcategory
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * Alarm source
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Alarm name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Alarm Key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Time
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get User AppID to Be Changed 
     * @return AppId User AppID to Be Changed
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User AppID to Be Changed
     * @param AppId User AppID to Be Changed
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Alarm category 
     * @return Type Alarm category
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Alarm category
     * @param Type Alarm category
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Alarm Subcategory 
     * @return SubType Alarm Subcategory
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set Alarm Subcategory
     * @param SubType Alarm Subcategory
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get Alarm source 
     * @return Source Alarm source
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Alarm source
     * @param Source Alarm source
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Alarm name 
     * @return Name Alarm name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Alarm name
     * @param Name Alarm name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Alarm Key 
     * @return Key Alarm Key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Alarm Key
     * @param Key Alarm Key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Time 
     * @return Date Time
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Time
     * @param Date Time
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Status. 
     * @return Status Status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public NewAlertKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NewAlertKey(NewAlertKey source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

