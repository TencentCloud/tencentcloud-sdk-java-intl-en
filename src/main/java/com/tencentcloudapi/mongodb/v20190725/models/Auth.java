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

public class Auth extends AbstractModel {

    /**
    * Permission information of the current account.
- 0: no permissions.
- 1: read-only.
- 3: read-write.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mask")
    @Expose
    private Long Mask;

    /**
    * Specifies the name of the database that has the current account permissions.
- \*: indicates all databases.
- db.name: indicates the database with a specific name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NameSpace")
    @Expose
    private String NameSpace;

    /**
     * Get Permission information of the current account.
- 0: no permissions.
- 1: read-only.
- 3: read-write.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Mask Permission information of the current account.
- 0: no permissions.
- 1: read-only.
- 3: read-write.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMask() {
        return this.Mask;
    }

    /**
     * Set Permission information of the current account.
- 0: no permissions.
- 1: read-only.
- 3: read-write.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Mask Permission information of the current account.
- 0: no permissions.
- 1: read-only.
- 3: read-write.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMask(Long Mask) {
        this.Mask = Mask;
    }

    /**
     * Get Specifies the name of the database that has the current account permissions.
- \*: indicates all databases.
- db.name: indicates the database with a specific name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NameSpace Specifies the name of the database that has the current account permissions.
- \*: indicates all databases.
- db.name: indicates the database with a specific name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNameSpace() {
        return this.NameSpace;
    }

    /**
     * Set Specifies the name of the database that has the current account permissions.
- \*: indicates all databases.
- db.name: indicates the database with a specific name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NameSpace Specifies the name of the database that has the current account permissions.
- \*: indicates all databases.
- db.name: indicates the database with a specific name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNameSpace(String NameSpace) {
        this.NameSpace = NameSpace;
    }

    public Auth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Auth(Auth source) {
        if (source.Mask != null) {
            this.Mask = new Long(source.Mask);
        }
        if (source.NameSpace != null) {
            this.NameSpace = new String(source.NameSpace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mask", this.Mask);
        this.setParamSimple(map, prefix + "NameSpace", this.NameSpace);

    }
}

