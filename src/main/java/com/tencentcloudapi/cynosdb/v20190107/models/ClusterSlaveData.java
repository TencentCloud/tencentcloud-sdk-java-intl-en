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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterSlaveData extends AbstractModel {

    /**
    * Old primary AZ
    */
    @SerializedName("OldMasterZone")
    @Expose
    private String OldMasterZone;

    /**
    * Secondary availability zone
    */
    @SerializedName("OldSlaveZone")
    @Expose
    private String [] OldSlaveZone;

    /**
    * New primary AZ
    */
    @SerializedName("NewMasterZone")
    @Expose
    private String NewMasterZone;

    /**
    * Secondary AZ
    */
    @SerializedName("NewSlaveZone")
    @Expose
    private String [] NewSlaveZone;

    /**
    * New secondary availability zone attribute
    */
    @SerializedName("NewSlaveZoneAttr")
    @Expose
    private SlaveZoneAttrItem [] NewSlaveZoneAttr;

    /**
    * Old availability zone attributes
    */
    @SerializedName("OldSlaveZoneAttr")
    @Expose
    private SlaveZoneAttrItem [] OldSlaveZoneAttr;

    /**
     * Get Old primary AZ 
     * @return OldMasterZone Old primary AZ
     */
    public String getOldMasterZone() {
        return this.OldMasterZone;
    }

    /**
     * Set Old primary AZ
     * @param OldMasterZone Old primary AZ
     */
    public void setOldMasterZone(String OldMasterZone) {
        this.OldMasterZone = OldMasterZone;
    }

    /**
     * Get Secondary availability zone 
     * @return OldSlaveZone Secondary availability zone
     */
    public String [] getOldSlaveZone() {
        return this.OldSlaveZone;
    }

    /**
     * Set Secondary availability zone
     * @param OldSlaveZone Secondary availability zone
     */
    public void setOldSlaveZone(String [] OldSlaveZone) {
        this.OldSlaveZone = OldSlaveZone;
    }

    /**
     * Get New primary AZ 
     * @return NewMasterZone New primary AZ
     */
    public String getNewMasterZone() {
        return this.NewMasterZone;
    }

    /**
     * Set New primary AZ
     * @param NewMasterZone New primary AZ
     */
    public void setNewMasterZone(String NewMasterZone) {
        this.NewMasterZone = NewMasterZone;
    }

    /**
     * Get Secondary AZ 
     * @return NewSlaveZone Secondary AZ
     */
    public String [] getNewSlaveZone() {
        return this.NewSlaveZone;
    }

    /**
     * Set Secondary AZ
     * @param NewSlaveZone Secondary AZ
     */
    public void setNewSlaveZone(String [] NewSlaveZone) {
        this.NewSlaveZone = NewSlaveZone;
    }

    /**
     * Get New secondary availability zone attribute 
     * @return NewSlaveZoneAttr New secondary availability zone attribute
     */
    public SlaveZoneAttrItem [] getNewSlaveZoneAttr() {
        return this.NewSlaveZoneAttr;
    }

    /**
     * Set New secondary availability zone attribute
     * @param NewSlaveZoneAttr New secondary availability zone attribute
     */
    public void setNewSlaveZoneAttr(SlaveZoneAttrItem [] NewSlaveZoneAttr) {
        this.NewSlaveZoneAttr = NewSlaveZoneAttr;
    }

    /**
     * Get Old availability zone attributes 
     * @return OldSlaveZoneAttr Old availability zone attributes
     */
    public SlaveZoneAttrItem [] getOldSlaveZoneAttr() {
        return this.OldSlaveZoneAttr;
    }

    /**
     * Set Old availability zone attributes
     * @param OldSlaveZoneAttr Old availability zone attributes
     */
    public void setOldSlaveZoneAttr(SlaveZoneAttrItem [] OldSlaveZoneAttr) {
        this.OldSlaveZoneAttr = OldSlaveZoneAttr;
    }

    public ClusterSlaveData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterSlaveData(ClusterSlaveData source) {
        if (source.OldMasterZone != null) {
            this.OldMasterZone = new String(source.OldMasterZone);
        }
        if (source.OldSlaveZone != null) {
            this.OldSlaveZone = new String[source.OldSlaveZone.length];
            for (int i = 0; i < source.OldSlaveZone.length; i++) {
                this.OldSlaveZone[i] = new String(source.OldSlaveZone[i]);
            }
        }
        if (source.NewMasterZone != null) {
            this.NewMasterZone = new String(source.NewMasterZone);
        }
        if (source.NewSlaveZone != null) {
            this.NewSlaveZone = new String[source.NewSlaveZone.length];
            for (int i = 0; i < source.NewSlaveZone.length; i++) {
                this.NewSlaveZone[i] = new String(source.NewSlaveZone[i]);
            }
        }
        if (source.NewSlaveZoneAttr != null) {
            this.NewSlaveZoneAttr = new SlaveZoneAttrItem[source.NewSlaveZoneAttr.length];
            for (int i = 0; i < source.NewSlaveZoneAttr.length; i++) {
                this.NewSlaveZoneAttr[i] = new SlaveZoneAttrItem(source.NewSlaveZoneAttr[i]);
            }
        }
        if (source.OldSlaveZoneAttr != null) {
            this.OldSlaveZoneAttr = new SlaveZoneAttrItem[source.OldSlaveZoneAttr.length];
            for (int i = 0; i < source.OldSlaveZoneAttr.length; i++) {
                this.OldSlaveZoneAttr[i] = new SlaveZoneAttrItem(source.OldSlaveZoneAttr[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldMasterZone", this.OldMasterZone);
        this.setParamArraySimple(map, prefix + "OldSlaveZone.", this.OldSlaveZone);
        this.setParamSimple(map, prefix + "NewMasterZone", this.NewMasterZone);
        this.setParamArraySimple(map, prefix + "NewSlaveZone.", this.NewSlaveZone);
        this.setParamArrayObj(map, prefix + "NewSlaveZoneAttr.", this.NewSlaveZoneAttr);
        this.setParamArrayObj(map, prefix + "OldSlaveZoneAttr.", this.OldSlaveZoneAttr);

    }
}

