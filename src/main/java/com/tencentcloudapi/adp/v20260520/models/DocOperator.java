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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocOperator extends AbstractModel {

    /**
    * <p>Modifier</p>
    */
    @SerializedName("Modifier")
    @Expose
    private Operator Modifier;

    /**
    * <p>Operation permission</p>
    */
    @SerializedName("Permission")
    @Expose
    private DocPermission Permission;

    /**
     * Get <p>Modifier</p> 
     * @return Modifier <p>Modifier</p>
     */
    public Operator getModifier() {
        return this.Modifier;
    }

    /**
     * Set <p>Modifier</p>
     * @param Modifier <p>Modifier</p>
     */
    public void setModifier(Operator Modifier) {
        this.Modifier = Modifier;
    }

    /**
     * Get <p>Operation permission</p> 
     * @return Permission <p>Operation permission</p>
     */
    public DocPermission getPermission() {
        return this.Permission;
    }

    /**
     * Set <p>Operation permission</p>
     * @param Permission <p>Operation permission</p>
     */
    public void setPermission(DocPermission Permission) {
        this.Permission = Permission;
    }

    public DocOperator() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocOperator(DocOperator source) {
        if (source.Modifier != null) {
            this.Modifier = new Operator(source.Modifier);
        }
        if (source.Permission != null) {
            this.Permission = new DocPermission(source.Permission);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Modifier.", this.Modifier);
        this.setParamObj(map, prefix + "Permission.", this.Permission);

    }
}

