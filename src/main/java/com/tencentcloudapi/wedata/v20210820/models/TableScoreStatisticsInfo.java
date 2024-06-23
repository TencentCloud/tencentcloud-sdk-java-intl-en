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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableScoreStatisticsInfo extends AbstractModel {

    /**
    * Levels 1,2,3,4,5
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * PercentageNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * Table quantityNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableNumber")
    @Expose
    private Long TableNumber;

    /**
     * Get Levels 1,2,3,4,5
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Level Levels 1,2,3,4,5
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Levels 1,2,3,4,5
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Level Levels 1,2,3,4,5
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get PercentageNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Scale PercentageNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set PercentageNote: This field may return null, indicating that no valid value can be obtained.
     * @param Scale PercentageNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get Table quantityNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TableNumber Table quantityNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTableNumber() {
        return this.TableNumber;
    }

    /**
     * Set Table quantityNote: This field may return null, indicating that no valid value can be obtained.
     * @param TableNumber Table quantityNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableNumber(Long TableNumber) {
        this.TableNumber = TableNumber;
    }

    public TableScoreStatisticsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableScoreStatisticsInfo(TableScoreStatisticsInfo source) {
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
        if (source.TableNumber != null) {
            this.TableNumber = new Long(source.TableNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "TableNumber", this.TableNumber);

    }
}

