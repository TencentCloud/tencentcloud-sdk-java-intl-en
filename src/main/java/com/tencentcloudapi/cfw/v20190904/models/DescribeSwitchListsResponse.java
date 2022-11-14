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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSwitchListsResponse extends AbstractModel{

    /**
    * Total entries
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * List data
    */
    @SerializedName("Data")
    @Expose
    private SwitchListsData [] Data;

    /**
    * Region list
    */
    @SerializedName("AreaLists")
    @Expose
    private String [] AreaLists;

    /**
    * Number of enabled firewalls
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("OnNum")
    @Expose
    private Long OnNum;

    /**
    * Number of disabled firewalls
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("OffNum")
    @Expose
    private Long OffNum;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total entries 
     * @return Total Total entries
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total entries
     * @param Total Total entries
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get List data 
     * @return Data List data
     */
    public SwitchListsData [] getData() {
        return this.Data;
    }

    /**
     * Set List data
     * @param Data List data
     */
    public void setData(SwitchListsData [] Data) {
        this.Data = Data;
    }

    /**
     * Get Region list 
     * @return AreaLists Region list
     */
    public String [] getAreaLists() {
        return this.AreaLists;
    }

    /**
     * Set Region list
     * @param AreaLists Region list
     */
    public void setAreaLists(String [] AreaLists) {
        this.AreaLists = AreaLists;
    }

    /**
     * Get Number of enabled firewalls
Note: This field may return `null`, indicating that no valid value was found. 
     * @return OnNum Number of enabled firewalls
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getOnNum() {
        return this.OnNum;
    }

    /**
     * Set Number of enabled firewalls
Note: This field may return `null`, indicating that no valid value was found.
     * @param OnNum Number of enabled firewalls
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setOnNum(Long OnNum) {
        this.OnNum = OnNum;
    }

    /**
     * Get Number of disabled firewalls
Note: This field may return `null`, indicating that no valid value was found. 
     * @return OffNum Number of disabled firewalls
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getOffNum() {
        return this.OffNum;
    }

    /**
     * Set Number of disabled firewalls
Note: This field may return `null`, indicating that no valid value was found.
     * @param OffNum Number of disabled firewalls
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setOffNum(Long OffNum) {
        this.OffNum = OffNum;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSwitchListsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSwitchListsResponse(DescribeSwitchListsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new SwitchListsData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SwitchListsData(source.Data[i]);
            }
        }
        if (source.AreaLists != null) {
            this.AreaLists = new String[source.AreaLists.length];
            for (int i = 0; i < source.AreaLists.length; i++) {
                this.AreaLists[i] = new String(source.AreaLists[i]);
            }
        }
        if (source.OnNum != null) {
            this.OnNum = new Long(source.OnNum);
        }
        if (source.OffNum != null) {
            this.OffNum = new Long(source.OffNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArraySimple(map, prefix + "AreaLists.", this.AreaLists);
        this.setParamSimple(map, prefix + "OnNum", this.OnNum);
        this.setParamSimple(map, prefix + "OffNum", this.OffNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

