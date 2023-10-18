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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrossRegionStatus extends AbstractModel {

    /**
    * The target region of cross-region backup
    */
    @SerializedName("CrossRegion")
    @Expose
    private String CrossRegion;

    /**
    * Synchronization status of cross-region backup. Valid values: `0` (creating), `1` (succeeded), `2`: (failed), `4` (syncing)
    */
    @SerializedName("CrossStatus")
    @Expose
    private Long CrossStatus;

    /**
     * Get The target region of cross-region backup 
     * @return CrossRegion The target region of cross-region backup
     */
    public String getCrossRegion() {
        return this.CrossRegion;
    }

    /**
     * Set The target region of cross-region backup
     * @param CrossRegion The target region of cross-region backup
     */
    public void setCrossRegion(String CrossRegion) {
        this.CrossRegion = CrossRegion;
    }

    /**
     * Get Synchronization status of cross-region backup. Valid values: `0` (creating), `1` (succeeded), `2`: (failed), `4` (syncing) 
     * @return CrossStatus Synchronization status of cross-region backup. Valid values: `0` (creating), `1` (succeeded), `2`: (failed), `4` (syncing)
     */
    public Long getCrossStatus() {
        return this.CrossStatus;
    }

    /**
     * Set Synchronization status of cross-region backup. Valid values: `0` (creating), `1` (succeeded), `2`: (failed), `4` (syncing)
     * @param CrossStatus Synchronization status of cross-region backup. Valid values: `0` (creating), `1` (succeeded), `2`: (failed), `4` (syncing)
     */
    public void setCrossStatus(Long CrossStatus) {
        this.CrossStatus = CrossStatus;
    }

    public CrossRegionStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrossRegionStatus(CrossRegionStatus source) {
        if (source.CrossRegion != null) {
            this.CrossRegion = new String(source.CrossRegion);
        }
        if (source.CrossStatus != null) {
            this.CrossStatus = new Long(source.CrossStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CrossRegion", this.CrossRegion);
        this.setParamSimple(map, prefix + "CrossStatus", this.CrossStatus);

    }
}

