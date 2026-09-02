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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerMountItem extends AbstractModel {

    /**
    * <p>Mount type</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Host path</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>Path within container</p>
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
    * <p>Mount mode</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>Whether it is readable and writable</p>
    */
    @SerializedName("RW")
    @Expose
    private Boolean RW;

    /**
    * <p>Spread method</p>
    */
    @SerializedName("Propagation")
    @Expose
    private String Propagation;

    /**
    * <p>Mount name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Driver name</p>
    */
    @SerializedName("Driver")
    @Expose
    private String Driver;

    /**
     * Get <p>Mount type</p> 
     * @return Type <p>Mount type</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Mount type</p>
     * @param Type <p>Mount type</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Host path</p> 
     * @return Source <p>Host path</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>Host path</p>
     * @param Source <p>Host path</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>Path within container</p> 
     * @return Destination <p>Path within container</p>
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set <p>Path within container</p>
     * @param Destination <p>Path within container</p>
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Get <p>Mount mode</p> 
     * @return Mode <p>Mount mode</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>Mount mode</p>
     * @param Mode <p>Mount mode</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>Whether it is readable and writable</p> 
     * @return RW <p>Whether it is readable and writable</p>
     */
    public Boolean getRW() {
        return this.RW;
    }

    /**
     * Set <p>Whether it is readable and writable</p>
     * @param RW <p>Whether it is readable and writable</p>
     */
    public void setRW(Boolean RW) {
        this.RW = RW;
    }

    /**
     * Get <p>Spread method</p> 
     * @return Propagation <p>Spread method</p>
     */
    public String getPropagation() {
        return this.Propagation;
    }

    /**
     * Set <p>Spread method</p>
     * @param Propagation <p>Spread method</p>
     */
    public void setPropagation(String Propagation) {
        this.Propagation = Propagation;
    }

    /**
     * Get <p>Mount name</p> 
     * @return Name <p>Mount name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Mount name</p>
     * @param Name <p>Mount name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Driver name</p> 
     * @return Driver <p>Driver name</p>
     */
    public String getDriver() {
        return this.Driver;
    }

    /**
     * Set <p>Driver name</p>
     * @param Driver <p>Driver name</p>
     */
    public void setDriver(String Driver) {
        this.Driver = Driver;
    }

    public ContainerMountItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerMountItem(ContainerMountItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Destination != null) {
            this.Destination = new String(source.Destination);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.RW != null) {
            this.RW = new Boolean(source.RW);
        }
        if (source.Propagation != null) {
            this.Propagation = new String(source.Propagation);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Driver != null) {
            this.Driver = new String(source.Driver);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Destination", this.Destination);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "RW", this.RW);
        this.setParamSimple(map, prefix + "Propagation", this.Propagation);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Driver", this.Driver);

    }
}

