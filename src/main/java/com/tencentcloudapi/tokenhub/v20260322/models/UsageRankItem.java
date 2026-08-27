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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageRankItem extends AbstractModel {

    /**
    * Global ranking (starting from 1). In pagination scenarios, this is still the position in the full sorting order, not the serial number within the page.
    */
    @SerializedName("Rank")
    @Expose
    private Long Rank;

    /**
    * Object identifier. The apikey dimension is the APIKey ID; the endpoint dimension is the access point; the model dimension is the model name.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Display name of the object. In the apikey dimension, return the APIKey name (deleted APIKeys retain their original names);
Key whose endpoint and model dimensions are equal.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Statistical value within a time period
    */
    @SerializedName("Stats")
    @Expose
    private UsageStats Stats;

    /**
    * List of time series points within a time period
    */
    @SerializedName("Series")
    @Expose
    private UsageSeries Series;

    /**
     * Get Global ranking (starting from 1). In pagination scenarios, this is still the position in the full sorting order, not the serial number within the page. 
     * @return Rank Global ranking (starting from 1). In pagination scenarios, this is still the position in the full sorting order, not the serial number within the page.
     */
    public Long getRank() {
        return this.Rank;
    }

    /**
     * Set Global ranking (starting from 1). In pagination scenarios, this is still the position in the full sorting order, not the serial number within the page.
     * @param Rank Global ranking (starting from 1). In pagination scenarios, this is still the position in the full sorting order, not the serial number within the page.
     */
    public void setRank(Long Rank) {
        this.Rank = Rank;
    }

    /**
     * Get Object identifier. The apikey dimension is the APIKey ID; the endpoint dimension is the access point; the model dimension is the model name. 
     * @return Key Object identifier. The apikey dimension is the APIKey ID; the endpoint dimension is the access point; the model dimension is the model name.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Object identifier. The apikey dimension is the APIKey ID; the endpoint dimension is the access point; the model dimension is the model name.
     * @param Key Object identifier. The apikey dimension is the APIKey ID; the endpoint dimension is the access point; the model dimension is the model name.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Display name of the object. In the apikey dimension, return the APIKey name (deleted APIKeys retain their original names);
Key whose endpoint and model dimensions are equal. 
     * @return Name Display name of the object. In the apikey dimension, return the APIKey name (deleted APIKeys retain their original names);
Key whose endpoint and model dimensions are equal.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Display name of the object. In the apikey dimension, return the APIKey name (deleted APIKeys retain their original names);
Key whose endpoint and model dimensions are equal.
     * @param Name Display name of the object. In the apikey dimension, return the APIKey name (deleted APIKeys retain their original names);
Key whose endpoint and model dimensions are equal.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Statistical value within a time period 
     * @return Stats Statistical value within a time period
     */
    public UsageStats getStats() {
        return this.Stats;
    }

    /**
     * Set Statistical value within a time period
     * @param Stats Statistical value within a time period
     */
    public void setStats(UsageStats Stats) {
        this.Stats = Stats;
    }

    /**
     * Get List of time series points within a time period 
     * @return Series List of time series points within a time period
     */
    public UsageSeries getSeries() {
        return this.Series;
    }

    /**
     * Set List of time series points within a time period
     * @param Series List of time series points within a time period
     */
    public void setSeries(UsageSeries Series) {
        this.Series = Series;
    }

    public UsageRankItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageRankItem(UsageRankItem source) {
        if (source.Rank != null) {
            this.Rank = new Long(source.Rank);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Stats != null) {
            this.Stats = new UsageStats(source.Stats);
        }
        if (source.Series != null) {
            this.Series = new UsageSeries(source.Series);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Rank", this.Rank);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Stats.", this.Stats);
        this.setParamObj(map, prefix + "Series.", this.Series);

    }
}

