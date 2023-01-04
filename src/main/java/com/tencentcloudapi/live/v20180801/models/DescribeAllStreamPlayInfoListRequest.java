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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllStreamPlayInfoListRequest extends AbstractModel{

    /**
    * The time point to query in the format of “yyyy-mm-dd HH:MM:00”(accurate to the minute). You can query data from the last month. Because there is a five-minute delay in the data, if you want to get the latest data, we recommend you pass in a time point five minutes earlier than the current time.
    */
    @SerializedName("QueryTime")
    @Expose
    private String QueryTime;

    /**
    * The playback domains to query. If you leave this empty, all playback domains will be queried.
    */
    @SerializedName("PlayDomains")
    @Expose
    private String [] PlayDomains;

    /**
     * Get The time point to query in the format of “yyyy-mm-dd HH:MM:00”(accurate to the minute). You can query data from the last month. Because there is a five-minute delay in the data, if you want to get the latest data, we recommend you pass in a time point five minutes earlier than the current time. 
     * @return QueryTime The time point to query in the format of “yyyy-mm-dd HH:MM:00”(accurate to the minute). You can query data from the last month. Because there is a five-minute delay in the data, if you want to get the latest data, we recommend you pass in a time point five minutes earlier than the current time.
     */
    public String getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set The time point to query in the format of “yyyy-mm-dd HH:MM:00”(accurate to the minute). You can query data from the last month. Because there is a five-minute delay in the data, if you want to get the latest data, we recommend you pass in a time point five minutes earlier than the current time.
     * @param QueryTime The time point to query in the format of “yyyy-mm-dd HH:MM:00”(accurate to the minute). You can query data from the last month. Because there is a five-minute delay in the data, if you want to get the latest data, we recommend you pass in a time point five minutes earlier than the current time.
     */
    public void setQueryTime(String QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get The playback domains to query. If you leave this empty, all playback domains will be queried. 
     * @return PlayDomains The playback domains to query. If you leave this empty, all playback domains will be queried.
     */
    public String [] getPlayDomains() {
        return this.PlayDomains;
    }

    /**
     * Set The playback domains to query. If you leave this empty, all playback domains will be queried.
     * @param PlayDomains The playback domains to query. If you leave this empty, all playback domains will be queried.
     */
    public void setPlayDomains(String [] PlayDomains) {
        this.PlayDomains = PlayDomains;
    }

    public DescribeAllStreamPlayInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllStreamPlayInfoListRequest(DescribeAllStreamPlayInfoListRequest source) {
        if (source.QueryTime != null) {
            this.QueryTime = new String(source.QueryTime);
        }
        if (source.PlayDomains != null) {
            this.PlayDomains = new String[source.PlayDomains.length];
            for (int i = 0; i < source.PlayDomains.length; i++) {
                this.PlayDomains[i] = new String(source.PlayDomains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamArraySimple(map, prefix + "PlayDomains.", this.PlayDomains);

    }
}

