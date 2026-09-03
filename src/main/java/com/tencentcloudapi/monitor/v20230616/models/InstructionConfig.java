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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstructionConfig extends AbstractModel {

    /**
    * <p>Role definition</p>
    */
    @SerializedName("RolePosition")
    @Expose
    private String RolePosition;

    /**
    * <p>Core responsibility</p>
    */
    @SerializedName("CoreDuty")
    @Expose
    private String CoreDuty;

    /**
    * <p>Core principle</p>
    */
    @SerializedName("CoreTruths")
    @Expose
    private String CoreTruths;

    /**
    * <p>Style constraints</p>
    */
    @SerializedName("Vibe")
    @Expose
    private String Vibe;

    /**
    * <p>Notes</p>
    */
    @SerializedName("Boundaries")
    @Expose
    private String Boundaries;

    /**
     * Get <p>Role definition</p> 
     * @return RolePosition <p>Role definition</p>
     */
    public String getRolePosition() {
        return this.RolePosition;
    }

    /**
     * Set <p>Role definition</p>
     * @param RolePosition <p>Role definition</p>
     */
    public void setRolePosition(String RolePosition) {
        this.RolePosition = RolePosition;
    }

    /**
     * Get <p>Core responsibility</p> 
     * @return CoreDuty <p>Core responsibility</p>
     */
    public String getCoreDuty() {
        return this.CoreDuty;
    }

    /**
     * Set <p>Core responsibility</p>
     * @param CoreDuty <p>Core responsibility</p>
     */
    public void setCoreDuty(String CoreDuty) {
        this.CoreDuty = CoreDuty;
    }

    /**
     * Get <p>Core principle</p> 
     * @return CoreTruths <p>Core principle</p>
     */
    public String getCoreTruths() {
        return this.CoreTruths;
    }

    /**
     * Set <p>Core principle</p>
     * @param CoreTruths <p>Core principle</p>
     */
    public void setCoreTruths(String CoreTruths) {
        this.CoreTruths = CoreTruths;
    }

    /**
     * Get <p>Style constraints</p> 
     * @return Vibe <p>Style constraints</p>
     */
    public String getVibe() {
        return this.Vibe;
    }

    /**
     * Set <p>Style constraints</p>
     * @param Vibe <p>Style constraints</p>
     */
    public void setVibe(String Vibe) {
        this.Vibe = Vibe;
    }

    /**
     * Get <p>Notes</p> 
     * @return Boundaries <p>Notes</p>
     */
    public String getBoundaries() {
        return this.Boundaries;
    }

    /**
     * Set <p>Notes</p>
     * @param Boundaries <p>Notes</p>
     */
    public void setBoundaries(String Boundaries) {
        this.Boundaries = Boundaries;
    }

    public InstructionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstructionConfig(InstructionConfig source) {
        if (source.RolePosition != null) {
            this.RolePosition = new String(source.RolePosition);
        }
        if (source.CoreDuty != null) {
            this.CoreDuty = new String(source.CoreDuty);
        }
        if (source.CoreTruths != null) {
            this.CoreTruths = new String(source.CoreTruths);
        }
        if (source.Vibe != null) {
            this.Vibe = new String(source.Vibe);
        }
        if (source.Boundaries != null) {
            this.Boundaries = new String(source.Boundaries);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RolePosition", this.RolePosition);
        this.setParamSimple(map, prefix + "CoreDuty", this.CoreDuty);
        this.setParamSimple(map, prefix + "CoreTruths", this.CoreTruths);
        this.setParamSimple(map, prefix + "Vibe", this.Vibe);
        this.setParamSimple(map, prefix + "Boundaries", this.Boundaries);

    }
}

