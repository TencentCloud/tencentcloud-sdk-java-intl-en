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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanRangeInfo extends AbstractModel {

    /**
    * true: select all;
false: partial select
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
    * SCAN_NORMAL: Regular node;
SCAN_SUPER: Super node
SCAN_CONTAINER: Container
    */
    @SerializedName("RangeType")
    @Expose
    private String RangeType;

    /**
    * Selected ID
    */
    @SerializedName("IDs")
    @Expose
    private String [] IDs;

    /**
     * Get true: select all;
false: partial select 
     * @return IsAll true: select all;
false: partial select
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set true: select all;
false: partial select
     * @param IsAll true: select all;
false: partial select
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get SCAN_NORMAL: Regular node;
SCAN_SUPER: Super node
SCAN_CONTAINER: Container 
     * @return RangeType SCAN_NORMAL: Regular node;
SCAN_SUPER: Super node
SCAN_CONTAINER: Container
     */
    public String getRangeType() {
        return this.RangeType;
    }

    /**
     * Set SCAN_NORMAL: Regular node;
SCAN_SUPER: Super node
SCAN_CONTAINER: Container
     * @param RangeType SCAN_NORMAL: Regular node;
SCAN_SUPER: Super node
SCAN_CONTAINER: Container
     */
    public void setRangeType(String RangeType) {
        this.RangeType = RangeType;
    }

    /**
     * Get Selected ID 
     * @return IDs Selected ID
     */
    public String [] getIDs() {
        return this.IDs;
    }

    /**
     * Set Selected ID
     * @param IDs Selected ID
     */
    public void setIDs(String [] IDs) {
        this.IDs = IDs;
    }

    public ScanRangeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanRangeInfo(ScanRangeInfo source) {
        if (source.IsAll != null) {
            this.IsAll = new Boolean(source.IsAll);
        }
        if (source.RangeType != null) {
            this.RangeType = new String(source.RangeType);
        }
        if (source.IDs != null) {
            this.IDs = new String[source.IDs.length];
            for (int i = 0; i < source.IDs.length; i++) {
                this.IDs[i] = new String(source.IDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);
        this.setParamSimple(map, prefix + "RangeType", this.RangeType);
        this.setParamArraySimple(map, prefix + "IDs.", this.IDs);

    }
}

