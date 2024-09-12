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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyTableDatasRequest extends AbstractModel {

    /**
    * Resource ID, which is the TCHouse-D resource ID used for table creation.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Name of the database where the source table is located.
    */
    @SerializedName("CopiedFromDb")
    @Expose
    private String CopiedFromDb;

    /**
    * Source table name
    */
    @SerializedName("CopiedFromTable")
    @Expose
    private String CopiedFromTable;

    /**
    * Name of the database where the target table is located
    */
    @SerializedName("CopyToDb")
    @Expose
    private String CopyToDb;

    /**
    * Target table name. If the table already exists, the structure of the source table and target table should be the same.
    */
    @SerializedName("CopyToTable")
    @Expose
    private String CopyToTable;

    /**
    * Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
    */
    @SerializedName("PassWord")
    @Expose
    private String PassWord;

    /**
    * Whether the data in the target table is overwritten. The default value is False.
    */
    @SerializedName("IsDataOverwrite")
    @Expose
    private Boolean IsDataOverwrite;

    /**
     * Get Resource ID, which is the TCHouse-D resource ID used for table creation. 
     * @return InstanceId Resource ID, which is the TCHouse-D resource ID used for table creation.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Resource ID, which is the TCHouse-D resource ID used for table creation.
     * @param InstanceId Resource ID, which is the TCHouse-D resource ID used for table creation.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Name of the database where the source table is located. 
     * @return CopiedFromDb Name of the database where the source table is located.
     */
    public String getCopiedFromDb() {
        return this.CopiedFromDb;
    }

    /**
     * Set Name of the database where the source table is located.
     * @param CopiedFromDb Name of the database where the source table is located.
     */
    public void setCopiedFromDb(String CopiedFromDb) {
        this.CopiedFromDb = CopiedFromDb;
    }

    /**
     * Get Source table name 
     * @return CopiedFromTable Source table name
     */
    public String getCopiedFromTable() {
        return this.CopiedFromTable;
    }

    /**
     * Set Source table name
     * @param CopiedFromTable Source table name
     */
    public void setCopiedFromTable(String CopiedFromTable) {
        this.CopiedFromTable = CopiedFromTable;
    }

    /**
     * Get Name of the database where the target table is located 
     * @return CopyToDb Name of the database where the target table is located
     */
    public String getCopyToDb() {
        return this.CopyToDb;
    }

    /**
     * Set Name of the database where the target table is located
     * @param CopyToDb Name of the database where the target table is located
     */
    public void setCopyToDb(String CopyToDb) {
        this.CopyToDb = CopyToDb;
    }

    /**
     * Get Target table name. If the table already exists, the structure of the source table and target table should be the same. 
     * @return CopyToTable Target table name. If the table already exists, the structure of the source table and target table should be the same.
     */
    public String getCopyToTable() {
        return this.CopyToTable;
    }

    /**
     * Set Target table name. If the table already exists, the structure of the source table and target table should be the same.
     * @param CopyToTable Target table name. If the table already exists, the structure of the source table and target table should be the same.
     */
    public void setCopyToTable(String CopyToTable) {
        this.CopyToTable = CopyToTable;
    }

    /**
     * Get Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in. 
     * @return UserName Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     * @param UserName Use the user who has corresponding permissions for operations. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in. 
     * @return PassWord Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public String getPassWord() {
        return this.PassWord;
    }

    /**
     * Set Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     * @param PassWord Password corresponding to the user. If the TCHouse-D cluster uses a kernel account registered by a CAM user, you do not need to fill it in.
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * Get Whether the data in the target table is overwritten. The default value is False. 
     * @return IsDataOverwrite Whether the data in the target table is overwritten. The default value is False.
     */
    public Boolean getIsDataOverwrite() {
        return this.IsDataOverwrite;
    }

    /**
     * Set Whether the data in the target table is overwritten. The default value is False.
     * @param IsDataOverwrite Whether the data in the target table is overwritten. The default value is False.
     */
    public void setIsDataOverwrite(Boolean IsDataOverwrite) {
        this.IsDataOverwrite = IsDataOverwrite;
    }

    public CopyTableDatasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyTableDatasRequest(CopyTableDatasRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CopiedFromDb != null) {
            this.CopiedFromDb = new String(source.CopiedFromDb);
        }
        if (source.CopiedFromTable != null) {
            this.CopiedFromTable = new String(source.CopiedFromTable);
        }
        if (source.CopyToDb != null) {
            this.CopyToDb = new String(source.CopyToDb);
        }
        if (source.CopyToTable != null) {
            this.CopyToTable = new String(source.CopyToTable);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PassWord != null) {
            this.PassWord = new String(source.PassWord);
        }
        if (source.IsDataOverwrite != null) {
            this.IsDataOverwrite = new Boolean(source.IsDataOverwrite);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CopiedFromDb", this.CopiedFromDb);
        this.setParamSimple(map, prefix + "CopiedFromTable", this.CopiedFromTable);
        this.setParamSimple(map, prefix + "CopyToDb", this.CopyToDb);
        this.setParamSimple(map, prefix + "CopyToTable", this.CopyToTable);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "IsDataOverwrite", this.IsDataOverwrite);

    }
}

