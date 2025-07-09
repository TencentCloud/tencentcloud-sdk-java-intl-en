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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOriginGroupRequest extends AbstractModel {

    /**
    * Name of the origin group
    */
    @SerializedName("OriginName")
    @Expose
    private String OriginName;

    /**
    * Origin-pull configuration type. This field is required when `OriginType=self`.
`area`: Origin-pull by region
`weight`: Origin-pull by weight
When `OriginType=third_party/cos`, it can be left empty.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Origin records
    */
    @SerializedName("Record")
    @Expose
    private OriginRecord [] Record;

    /**
    * ID of the site
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Origin type
`self`: Customer origin
`third_party`: Third-party origin
`cos`: Tencent Cloud COS origin
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
     * Get Name of the origin group 
     * @return OriginName Name of the origin group
     */
    public String getOriginName() {
        return this.OriginName;
    }

    /**
     * Set Name of the origin group
     * @param OriginName Name of the origin group
     */
    public void setOriginName(String OriginName) {
        this.OriginName = OriginName;
    }

    /**
     * Get Origin-pull configuration type. This field is required when `OriginType=self`.
`area`: Origin-pull by region
`weight`: Origin-pull by weight
When `OriginType=third_party/cos`, it can be left empty. 
     * @return Type Origin-pull configuration type. This field is required when `OriginType=self`.
`area`: Origin-pull by region
`weight`: Origin-pull by weight
When `OriginType=third_party/cos`, it can be left empty.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Origin-pull configuration type. This field is required when `OriginType=self`.
`area`: Origin-pull by region
`weight`: Origin-pull by weight
When `OriginType=third_party/cos`, it can be left empty.
     * @param Type Origin-pull configuration type. This field is required when `OriginType=self`.
`area`: Origin-pull by region
`weight`: Origin-pull by weight
When `OriginType=third_party/cos`, it can be left empty.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Origin records 
     * @return Record Origin records
     */
    public OriginRecord [] getRecord() {
        return this.Record;
    }

    /**
     * Set Origin records
     * @param Record Origin records
     */
    public void setRecord(OriginRecord [] Record) {
        this.Record = Record;
    }

    /**
     * Get ID of the site 
     * @return ZoneId ID of the site
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site
     * @param ZoneId ID of the site
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Origin type
`self`: Customer origin
`third_party`: Third-party origin
`cos`: Tencent Cloud COS origin 
     * @return OriginType Origin type
`self`: Customer origin
`third_party`: Third-party origin
`cos`: Tencent Cloud COS origin
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Origin type
`self`: Customer origin
`third_party`: Third-party origin
`cos`: Tencent Cloud COS origin
     * @param OriginType Origin type
`self`: Customer origin
`third_party`: Third-party origin
`cos`: Tencent Cloud COS origin
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    public CreateOriginGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOriginGroupRequest(CreateOriginGroupRequest source) {
        if (source.OriginName != null) {
            this.OriginName = new String(source.OriginName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Record != null) {
            this.Record = new OriginRecord[source.Record.length];
            for (int i = 0; i < source.Record.length; i++) {
                this.Record[i] = new OriginRecord(source.Record[i]);
            }
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginName", this.OriginName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Record.", this.Record);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);

    }
}

