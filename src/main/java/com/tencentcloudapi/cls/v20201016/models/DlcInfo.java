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

public class DlcInfo extends AbstractModel {

    /**
    * dlc table information
    */
    @SerializedName("TableInfo")
    @Expose
    private DlcTableInfo TableInfo;

    /**
    * dlc data field information
    */
    @SerializedName("FieldInfos")
    @Expose
    private DlcFiledInfo [] FieldInfos;

    /**
    * dlc partition information
    */
    @SerializedName("PartitionInfos")
    @Expose
    private DlcPartitionInfo [] PartitionInfos;

    /**
    * dlc partition additional information
    */
    @SerializedName("PartitionExtra")
    @Expose
    private DlcPartitionExtra PartitionExtra;

    /**
     * Get dlc table information 
     * @return TableInfo dlc table information
     */
    public DlcTableInfo getTableInfo() {
        return this.TableInfo;
    }

    /**
     * Set dlc table information
     * @param TableInfo dlc table information
     */
    public void setTableInfo(DlcTableInfo TableInfo) {
        this.TableInfo = TableInfo;
    }

    /**
     * Get dlc data field information 
     * @return FieldInfos dlc data field information
     */
    public DlcFiledInfo [] getFieldInfos() {
        return this.FieldInfos;
    }

    /**
     * Set dlc data field information
     * @param FieldInfos dlc data field information
     */
    public void setFieldInfos(DlcFiledInfo [] FieldInfos) {
        this.FieldInfos = FieldInfos;
    }

    /**
     * Get dlc partition information 
     * @return PartitionInfos dlc partition information
     */
    public DlcPartitionInfo [] getPartitionInfos() {
        return this.PartitionInfos;
    }

    /**
     * Set dlc partition information
     * @param PartitionInfos dlc partition information
     */
    public void setPartitionInfos(DlcPartitionInfo [] PartitionInfos) {
        this.PartitionInfos = PartitionInfos;
    }

    /**
     * Get dlc partition additional information 
     * @return PartitionExtra dlc partition additional information
     */
    public DlcPartitionExtra getPartitionExtra() {
        return this.PartitionExtra;
    }

    /**
     * Set dlc partition additional information
     * @param PartitionExtra dlc partition additional information
     */
    public void setPartitionExtra(DlcPartitionExtra PartitionExtra) {
        this.PartitionExtra = PartitionExtra;
    }

    public DlcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcInfo(DlcInfo source) {
        if (source.TableInfo != null) {
            this.TableInfo = new DlcTableInfo(source.TableInfo);
        }
        if (source.FieldInfos != null) {
            this.FieldInfos = new DlcFiledInfo[source.FieldInfos.length];
            for (int i = 0; i < source.FieldInfos.length; i++) {
                this.FieldInfos[i] = new DlcFiledInfo(source.FieldInfos[i]);
            }
        }
        if (source.PartitionInfos != null) {
            this.PartitionInfos = new DlcPartitionInfo[source.PartitionInfos.length];
            for (int i = 0; i < source.PartitionInfos.length; i++) {
                this.PartitionInfos[i] = new DlcPartitionInfo(source.PartitionInfos[i]);
            }
        }
        if (source.PartitionExtra != null) {
            this.PartitionExtra = new DlcPartitionExtra(source.PartitionExtra);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TableInfo.", this.TableInfo);
        this.setParamArrayObj(map, prefix + "FieldInfos.", this.FieldInfos);
        this.setParamArrayObj(map, prefix + "PartitionInfos.", this.PartitionInfos);
        this.setParamObj(map, prefix + "PartitionExtra.", this.PartitionExtra);

    }
}

