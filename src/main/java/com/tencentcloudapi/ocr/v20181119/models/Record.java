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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Record extends AbstractModel {

    /**
    * Serial number.
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * Exit/Entry
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Date of exit/entry
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Document name
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * Document number
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Port of exit/entry
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
     * Get Serial number. 
     * @return Index Serial number.
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set Serial number.
     * @param Index Serial number.
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get Exit/Entry 
     * @return Type Exit/Entry
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Exit/Entry
     * @param Type Exit/Entry
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Date of exit/entry 
     * @return Date Date of exit/entry
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Date of exit/entry
     * @param Date Date of exit/entry
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Document name 
     * @return CertName Document name
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set Document name
     * @param CertName Document name
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get Document number 
     * @return CertId Document number
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Document number
     * @param CertId Document number
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Port of exit/entry 
     * @return Port Port of exit/entry
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port of exit/entry
     * @param Port Port of exit/entry
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    public Record() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Record(Record source) {
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

