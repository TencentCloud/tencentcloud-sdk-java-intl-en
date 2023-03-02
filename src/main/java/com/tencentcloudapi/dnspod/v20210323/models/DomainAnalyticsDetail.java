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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainAnalyticsDetail extends AbstractModel{

    /**
    * DNS query volume in the current statistical dimension
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * Collection date for daily collection
    */
    @SerializedName("DateKey")
    @Expose
    private String DateKey;

    /**
    * The last hour (0–23) for hourly collection. For example, if `HourKey` is `23`, the DNS query volume in the statistical period of 22:00–23:00 will be collected.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HourKey")
    @Expose
    private Long HourKey;

    /**
     * Get DNS query volume in the current statistical dimension 
     * @return Num DNS query volume in the current statistical dimension
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set DNS query volume in the current statistical dimension
     * @param Num DNS query volume in the current statistical dimension
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get Collection date for daily collection 
     * @return DateKey Collection date for daily collection
     */
    public String getDateKey() {
        return this.DateKey;
    }

    /**
     * Set Collection date for daily collection
     * @param DateKey Collection date for daily collection
     */
    public void setDateKey(String DateKey) {
        this.DateKey = DateKey;
    }

    /**
     * Get The last hour (0–23) for hourly collection. For example, if `HourKey` is `23`, the DNS query volume in the statistical period of 22:00–23:00 will be collected.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HourKey The last hour (0–23) for hourly collection. For example, if `HourKey` is `23`, the DNS query volume in the statistical period of 22:00–23:00 will be collected.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHourKey() {
        return this.HourKey;
    }

    /**
     * Set The last hour (0–23) for hourly collection. For example, if `HourKey` is `23`, the DNS query volume in the statistical period of 22:00–23:00 will be collected.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HourKey The last hour (0–23) for hourly collection. For example, if `HourKey` is `23`, the DNS query volume in the statistical period of 22:00–23:00 will be collected.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHourKey(Long HourKey) {
        this.HourKey = HourKey;
    }

    public DomainAnalyticsDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainAnalyticsDetail(DomainAnalyticsDetail source) {
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.DateKey != null) {
            this.DateKey = new String(source.DateKey);
        }
        if (source.HourKey != null) {
            this.HourKey = new Long(source.HourKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "DateKey", this.DateKey);
        this.setParamSimple(map, prefix + "HourKey", this.HourKey);

    }
}

