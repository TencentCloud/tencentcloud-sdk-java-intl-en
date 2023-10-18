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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginRecord extends AbstractModel {

    /**
    * Record value
    */
    @SerializedName("Record")
    @Expose
    private String Record;

    /**
    * A specific region when `Type=area`.
The default region when `Type` is not specified.
    */
    @SerializedName("Area")
    @Expose
    private String [] Area;

    /**
    * A specific weight when `Type=weight`.
The value range is [1-100].
The total weight of multiple origins in an origin group should be 100.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Record ID
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Specifies whether to run private origin authentication.
It is valid only when `OriginType=third_part`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Private")
    @Expose
    private Boolean Private;

    /**
    * Private origin parameter.
It is valid only when `Private=true`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PrivateParameter")
    @Expose
    private OriginRecordPrivateParameter [] PrivateParameter;

    /**
    * 
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
     * Get Record value 
     * @return Record Record value
     */
    public String getRecord() {
        return this.Record;
    }

    /**
     * Set Record value
     * @param Record Record value
     */
    public void setRecord(String Record) {
        this.Record = Record;
    }

    /**
     * Get A specific region when `Type=area`.
The default region when `Type` is not specified. 
     * @return Area A specific region when `Type=area`.
The default region when `Type` is not specified.
     */
    public String [] getArea() {
        return this.Area;
    }

    /**
     * Set A specific region when `Type=area`.
The default region when `Type` is not specified.
     * @param Area A specific region when `Type=area`.
The default region when `Type` is not specified.
     */
    public void setArea(String [] Area) {
        this.Area = Area;
    }

    /**
     * Get A specific weight when `Type=weight`.
The value range is [1-100].
The total weight of multiple origins in an origin group should be 100. 
     * @return Weight A specific weight when `Type=weight`.
The value range is [1-100].
The total weight of multiple origins in an origin group should be 100.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set A specific weight when `Type=weight`.
The value range is [1-100].
The total weight of multiple origins in an origin group should be 100.
     * @param Weight A specific weight when `Type=weight`.
The value range is [1-100].
The total weight of multiple origins in an origin group should be 100.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Port 
     * @return Port Port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port
     * @param Port Port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Record ID 
     * @return RecordId Record ID
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Record ID
     * @param RecordId Record ID
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Specifies whether to run private origin authentication.
It is valid only when `OriginType=third_part`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Private Specifies whether to run private origin authentication.
It is valid only when `OriginType=third_part`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Boolean getPrivate() {
        return this.Private;
    }

    /**
     * Set Specifies whether to run private origin authentication.
It is valid only when `OriginType=third_part`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Private Specifies whether to run private origin authentication.
It is valid only when `OriginType=third_part`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPrivate(Boolean Private) {
        this.Private = Private;
    }

    /**
     * Get Private origin parameter.
It is valid only when `Private=true`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return PrivateParameter Private origin parameter.
It is valid only when `Private=true`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public OriginRecordPrivateParameter [] getPrivateParameter() {
        return this.PrivateParameter;
    }

    /**
     * Set Private origin parameter.
It is valid only when `Private=true`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param PrivateParameter Private origin parameter.
It is valid only when `Private=true`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPrivateParameter(OriginRecordPrivateParameter [] PrivateParameter) {
        this.PrivateParameter = PrivateParameter;
    }

    /**
     * Get  
     * @return Proto 
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set 
     * @param Proto 
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    public OriginRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginRecord(OriginRecord source) {
        if (source.Record != null) {
            this.Record = new String(source.Record);
        }
        if (source.Area != null) {
            this.Area = new String[source.Area.length];
            for (int i = 0; i < source.Area.length; i++) {
                this.Area[i] = new String(source.Area[i]);
            }
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Private != null) {
            this.Private = new Boolean(source.Private);
        }
        if (source.PrivateParameter != null) {
            this.PrivateParameter = new OriginRecordPrivateParameter[source.PrivateParameter.length];
            for (int i = 0; i < source.PrivateParameter.length; i++) {
                this.PrivateParameter[i] = new OriginRecordPrivateParameter(source.PrivateParameter[i]);
            }
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Record", this.Record);
        this.setParamArraySimple(map, prefix + "Area.", this.Area);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Private", this.Private);
        this.setParamArrayObj(map, prefix + "PrivateParameter.", this.PrivateParameter);
        this.setParamSimple(map, prefix + "Proto", this.Proto);

    }
}

