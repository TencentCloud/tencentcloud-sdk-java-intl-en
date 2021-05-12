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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageBlock extends AbstractModel{

    /**
    * Local HDD storage type. Value: LOCAL_PRO.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Minimum capacity of local HDD storage
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * Maximum capacity of local HDD storage
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
     * Get Local HDD storage type. Value: LOCAL_PRO.
Note: This field may return null, indicating that no valid value is found. 
     * @return Type Local HDD storage type. Value: LOCAL_PRO.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Local HDD storage type. Value: LOCAL_PRO.
Note: This field may return null, indicating that no valid value is found.
     * @param Type Local HDD storage type. Value: LOCAL_PRO.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Minimum capacity of local HDD storage
Note: This field may return null, indicating that no valid value is found. 
     * @return MinSize Minimum capacity of local HDD storage
Note: This field may return null, indicating that no valid value is found.
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set Minimum capacity of local HDD storage
Note: This field may return null, indicating that no valid value is found.
     * @param MinSize Minimum capacity of local HDD storage
Note: This field may return null, indicating that no valid value is found.
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get Maximum capacity of local HDD storage
Note: This field may return null, indicating that no valid value is found. 
     * @return MaxSize Maximum capacity of local HDD storage
Note: This field may return null, indicating that no valid value is found.
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Maximum capacity of local HDD storage
Note: This field may return null, indicating that no valid value is found.
     * @param MaxSize Maximum capacity of local HDD storage
Note: This field may return null, indicating that no valid value is found.
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    public StorageBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageBlock(StorageBlock source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}

