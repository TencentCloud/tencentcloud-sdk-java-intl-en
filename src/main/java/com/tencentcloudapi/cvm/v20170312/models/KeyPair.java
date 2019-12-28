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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyPair extends AbstractModel{

    /**
    * Key pair `ID`, the unique identifier of a key pair.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Key pair name.
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * `ID` of the project to which a key pair belongs.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Key pair description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Content of public key in a key pair.
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * Content of private key in a key pair. Tencent Cloud do not keep private keys. Please keep it properly.
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * `ID` list of instances associated with a key.
    */
    @SerializedName("AssociatedInstanceIds")
    @Expose
    private String [] AssociatedInstanceIds;

    /**
    * Creation time, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get Key pair `ID`, the unique identifier of a key pair. 
     * @return KeyId Key pair `ID`, the unique identifier of a key pair.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Key pair `ID`, the unique identifier of a key pair.
     * @param KeyId Key pair `ID`, the unique identifier of a key pair.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Key pair name. 
     * @return KeyName Key pair name.
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set Key pair name.
     * @param KeyName Key pair name.
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get `ID` of the project to which a key pair belongs. 
     * @return ProjectId `ID` of the project to which a key pair belongs.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set `ID` of the project to which a key pair belongs.
     * @param ProjectId `ID` of the project to which a key pair belongs.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Key pair description. 
     * @return Description Key pair description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Key pair description.
     * @param Description Key pair description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Content of public key in a key pair. 
     * @return PublicKey Content of public key in a key pair.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set Content of public key in a key pair.
     * @param PublicKey Content of public key in a key pair.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get Content of private key in a key pair. Tencent Cloud do not keep private keys. Please keep it properly. 
     * @return PrivateKey Content of private key in a key pair. Tencent Cloud do not keep private keys. Please keep it properly.
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set Content of private key in a key pair. Tencent Cloud do not keep private keys. Please keep it properly.
     * @param PrivateKey Content of private key in a key pair. Tencent Cloud do not keep private keys. Please keep it properly.
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get `ID` list of instances associated with a key. 
     * @return AssociatedInstanceIds `ID` list of instances associated with a key.
     */
    public String [] getAssociatedInstanceIds() {
        return this.AssociatedInstanceIds;
    }

    /**
     * Set `ID` list of instances associated with a key.
     * @param AssociatedInstanceIds `ID` list of instances associated with a key.
     */
    public void setAssociatedInstanceIds(String [] AssociatedInstanceIds) {
        this.AssociatedInstanceIds = AssociatedInstanceIds;
    }

    /**
     * Get Creation time, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`. 
     * @return CreatedTime Creation time, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
     * @param CreatedTime Creation time, which follows the `ISO8601` standard and uses `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamArraySimple(map, prefix + "AssociatedInstanceIds.", this.AssociatedInstanceIds);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

