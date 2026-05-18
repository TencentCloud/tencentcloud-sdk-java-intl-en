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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestoreCollection extends AbstractModel {

    /**
    * Original collection to be rolled back
    */
    @SerializedName("OldCollection")
    @Expose
    private String OldCollection;

    /**
    * Rolled-back collection
    */
    @SerializedName("NewCollection")
    @Expose
    private String NewCollection;

    /**
     * Get Original collection to be rolled back 
     * @return OldCollection Original collection to be rolled back
     */
    public String getOldCollection() {
        return this.OldCollection;
    }

    /**
     * Set Original collection to be rolled back
     * @param OldCollection Original collection to be rolled back
     */
    public void setOldCollection(String OldCollection) {
        this.OldCollection = OldCollection;
    }

    /**
     * Get Rolled-back collection 
     * @return NewCollection Rolled-back collection
     */
    public String getNewCollection() {
        return this.NewCollection;
    }

    /**
     * Set Rolled-back collection
     * @param NewCollection Rolled-back collection
     */
    public void setNewCollection(String NewCollection) {
        this.NewCollection = NewCollection;
    }

    public RestoreCollection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreCollection(RestoreCollection source) {
        if (source.OldCollection != null) {
            this.OldCollection = new String(source.OldCollection);
        }
        if (source.NewCollection != null) {
            this.NewCollection = new String(source.NewCollection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldCollection", this.OldCollection);
        this.setParamSimple(map, prefix + "NewCollection", this.NewCollection);

    }
}

