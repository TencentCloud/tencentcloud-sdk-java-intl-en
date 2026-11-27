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
package com.tencentcloudapi.controlcenter.v20230110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DependsOnItem extends AbstractModel {

    /**
    * Dependency item type. Valid values: LandingZoneSetUp (Landing Zone dependency) and AccountFactorySetUp (Account Factory dependency).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Feature item unique ID, which can contain only English letters, numbers, and symbols (@,._[]-:()+=), and must be 2 to 128 characters in length.
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
     * Get Dependency item type. Valid values: LandingZoneSetUp (Landing Zone dependency) and AccountFactorySetUp (Account Factory dependency). 
     * @return Type Dependency item type. Valid values: LandingZoneSetUp (Landing Zone dependency) and AccountFactorySetUp (Account Factory dependency).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Dependency item type. Valid values: LandingZoneSetUp (Landing Zone dependency) and AccountFactorySetUp (Account Factory dependency).
     * @param Type Dependency item type. Valid values: LandingZoneSetUp (Landing Zone dependency) and AccountFactorySetUp (Account Factory dependency).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Feature item unique ID, which can contain only English letters, numbers, and symbols (@,._[]-:()+=), and must be 2 to 128 characters in length. 
     * @return Identifier Feature item unique ID, which can contain only English letters, numbers, and symbols (@,._[]-:()+=), and must be 2 to 128 characters in length.
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set Feature item unique ID, which can contain only English letters, numbers, and symbols (@,._[]-:()+=), and must be 2 to 128 characters in length.
     * @param Identifier Feature item unique ID, which can contain only English letters, numbers, and symbols (@,._[]-:()+=), and must be 2 to 128 characters in length.
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    public DependsOnItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DependsOnItem(DependsOnItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);

    }
}

