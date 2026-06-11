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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EsTimeInfo extends AbstractModel {

    /**
    * Time type 1: Log collection time 2: Specify log fields
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Log time field.

Time type is 2: Required when specifying log fields
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * Log time format.

Time type is 2: Required when specifying log fields
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * Time field time zone.

Time type is 2: Required when specifying log fields
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get Time type 1: Log collection time 2: Specify log fields 
     * @return Type Time type 1: Log collection time 2: Specify log fields
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Time type 1: Log collection time 2: Specify log fields
     * @param Type Time type 1: Log collection time 2: Specify log fields
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Log time field.

Time type is 2: Required when specifying log fields 
     * @return TimeKey Log time field.

Time type is 2: Required when specifying log fields
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set Log time field.

Time type is 2: Required when specifying log fields
     * @param TimeKey Log time field.

Time type is 2: Required when specifying log fields
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get Log time format.

Time type is 2: Required when specifying log fields 
     * @return TimeFormat Log time format.

Time type is 2: Required when specifying log fields
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set Log time format.

Time type is 2: Required when specifying log fields
     * @param TimeFormat Log time format.

Time type is 2: Required when specifying log fields
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get Time field time zone.

Time type is 2: Required when specifying log fields 
     * @return TimeZone Time field time zone.

Time type is 2: Required when specifying log fields
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set Time field time zone.

Time type is 2: Required when specifying log fields
     * @param TimeZone Time field time zone.

Time type is 2: Required when specifying log fields
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public EsTimeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EsTimeInfo(EsTimeInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TimeKey != null) {
            this.TimeKey = new String(source.TimeKey);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TimeKey", this.TimeKey);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

