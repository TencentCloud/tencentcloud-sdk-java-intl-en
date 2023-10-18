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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveTimeShiftBillInfoListRequest extends AbstractModel {

    /**
    * The start time for query. You can query data from the past three months. The longest time period that can be queried is one month.

It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end time for query. You can query data from the past three months. The longest time period that can be queried is one month.

It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The push domains to query. If you leave this empty, the time shifting billing data of all push domains will be returned.
    */
    @SerializedName("PushDomains")
    @Expose
    private String [] PushDomains;

    /**
     * Get The start time for query. You can query data from the past three months. The longest time period that can be queried is one month.

It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used. 
     * @return StartTime The start time for query. You can query data from the past three months. The longest time period that can be queried is one month.

It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time for query. You can query data from the past three months. The longest time period that can be queried is one month.

It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     * @param StartTime The start time for query. You can query data from the past three months. The longest time period that can be queried is one month.

It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time for query. You can query data from the past three months. The longest time period that can be queried is one month.

It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used. 
     * @return EndTime The end time for query. You can query data from the past three months. The longest time period that can be queried is one month.

It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time for query. You can query data from the past three months. The longest time period that can be queried is one month.

It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     * @param EndTime The end time for query. You can query data from the past three months. The longest time period that can be queried is one month.

It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The push domains to query. If you leave this empty, the time shifting billing data of all push domains will be returned. 
     * @return PushDomains The push domains to query. If you leave this empty, the time shifting billing data of all push domains will be returned.
     */
    public String [] getPushDomains() {
        return this.PushDomains;
    }

    /**
     * Set The push domains to query. If you leave this empty, the time shifting billing data of all push domains will be returned.
     * @param PushDomains The push domains to query. If you leave this empty, the time shifting billing data of all push domains will be returned.
     */
    public void setPushDomains(String [] PushDomains) {
        this.PushDomains = PushDomains;
    }

    public DescribeLiveTimeShiftBillInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveTimeShiftBillInfoListRequest(DescribeLiveTimeShiftBillInfoListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PushDomains != null) {
            this.PushDomains = new String[source.PushDomains.length];
            for (int i = 0; i < source.PushDomains.length; i++) {
                this.PushDomains[i] = new String(source.PushDomains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "PushDomains.", this.PushDomains);

    }
}

