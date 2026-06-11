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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MemShellRule extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Client ID
    */
    @SerializedName("UuidHostips")
    @Expose
    private UuidHostip [] UuidHostips;

    /**
    * Logical operator. 0: 5 valid regular expression logical ANDs; 1: logical OR.
    */
    @SerializedName("LogicalSymbol")
    @Expose
    private Long LogicalSymbol;

    /**
    * Class name regular expression, which is not matched if empty.
    */
    @SerializedName("ClassNameRegexp")
    @Expose
    private String ClassNameRegexp;

    /**
    * Parent class name regular expression, which is not matched if empty.
    */
    @SerializedName("SuperClassNameRegexp")
    @Expose
    private String SuperClassNameRegexp;

    /**
    * Inherited interface regular expression, which is not matched if empty.
    */
    @SerializedName("InterfacesRegexp")
    @Expose
    private String InterfacesRegexp;

    /**
    * Annotation regular expression, which is not matched if empty.
    */
    @SerializedName("AnnotationsRegexp")
    @Expose
    private String AnnotationsRegexp;

    /**
    * Associated class loader regular expression, which is not matched if empty.
    */
    @SerializedName("LoaderClassNameRegexp")
    @Expose
    private String LoaderClassNameRegexp;

    /**
    * Operator
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Whether it is a global rule. (Whether it is effective for all hosts under appid. 0: single UUID; 1: global. The default value is no.)
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * Status (0: valid, 1: deleted, 2: invalid (enabling switch off)).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Whether to process historical events. 0: no, 1: yes.
    */
    @SerializedName("HandleHistory")
    @Expose
    private Long HandleHistory;

    /**
    * Batch ID.
    */
    @SerializedName("GroupID")
    @Expose
    private String GroupID;

    /**
    * Number of servers covered by a rule. When IsGlobal is set to 1, all servers are displayed.
    */
    @SerializedName("MachinesNums")
    @Expose
    private String MachinesNums;

    /**
    * Policy name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Source code regular expression, which is not matched if empty.
    */
    @SerializedName("CodeSourceRegexp")
    @Expose
    private String CodeSourceRegexp;

    /**
    * Call stack regular expression, which is not matched if empty.
    */
    @SerializedName("CallStackRegexp")
    @Expose
    private String CallStackRegexp;

    /**
    * Whether a file exists. 0: Default value when a user does not select a rule. 1: File exists. 2: File does not exist.
    */
    @SerializedName("FileExist")
    @Expose
    private Long FileExist;

    /**
     * Get Rule ID 
     * @return Id Rule ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID
     * @param Id Rule ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Client ID 
     * @return UuidHostips Client ID
     */
    public UuidHostip [] getUuidHostips() {
        return this.UuidHostips;
    }

    /**
     * Set Client ID
     * @param UuidHostips Client ID
     */
    public void setUuidHostips(UuidHostip [] UuidHostips) {
        this.UuidHostips = UuidHostips;
    }

    /**
     * Get Logical operator. 0: 5 valid regular expression logical ANDs; 1: logical OR. 
     * @return LogicalSymbol Logical operator. 0: 5 valid regular expression logical ANDs; 1: logical OR.
     */
    public Long getLogicalSymbol() {
        return this.LogicalSymbol;
    }

    /**
     * Set Logical operator. 0: 5 valid regular expression logical ANDs; 1: logical OR.
     * @param LogicalSymbol Logical operator. 0: 5 valid regular expression logical ANDs; 1: logical OR.
     */
    public void setLogicalSymbol(Long LogicalSymbol) {
        this.LogicalSymbol = LogicalSymbol;
    }

    /**
     * Get Class name regular expression, which is not matched if empty. 
     * @return ClassNameRegexp Class name regular expression, which is not matched if empty.
     */
    public String getClassNameRegexp() {
        return this.ClassNameRegexp;
    }

    /**
     * Set Class name regular expression, which is not matched if empty.
     * @param ClassNameRegexp Class name regular expression, which is not matched if empty.
     */
    public void setClassNameRegexp(String ClassNameRegexp) {
        this.ClassNameRegexp = ClassNameRegexp;
    }

    /**
     * Get Parent class name regular expression, which is not matched if empty. 
     * @return SuperClassNameRegexp Parent class name regular expression, which is not matched if empty.
     */
    public String getSuperClassNameRegexp() {
        return this.SuperClassNameRegexp;
    }

    /**
     * Set Parent class name regular expression, which is not matched if empty.
     * @param SuperClassNameRegexp Parent class name regular expression, which is not matched if empty.
     */
    public void setSuperClassNameRegexp(String SuperClassNameRegexp) {
        this.SuperClassNameRegexp = SuperClassNameRegexp;
    }

    /**
     * Get Inherited interface regular expression, which is not matched if empty. 
     * @return InterfacesRegexp Inherited interface regular expression, which is not matched if empty.
     */
    public String getInterfacesRegexp() {
        return this.InterfacesRegexp;
    }

    /**
     * Set Inherited interface regular expression, which is not matched if empty.
     * @param InterfacesRegexp Inherited interface regular expression, which is not matched if empty.
     */
    public void setInterfacesRegexp(String InterfacesRegexp) {
        this.InterfacesRegexp = InterfacesRegexp;
    }

    /**
     * Get Annotation regular expression, which is not matched if empty. 
     * @return AnnotationsRegexp Annotation regular expression, which is not matched if empty.
     */
    public String getAnnotationsRegexp() {
        return this.AnnotationsRegexp;
    }

    /**
     * Set Annotation regular expression, which is not matched if empty.
     * @param AnnotationsRegexp Annotation regular expression, which is not matched if empty.
     */
    public void setAnnotationsRegexp(String AnnotationsRegexp) {
        this.AnnotationsRegexp = AnnotationsRegexp;
    }

    /**
     * Get Associated class loader regular expression, which is not matched if empty. 
     * @return LoaderClassNameRegexp Associated class loader regular expression, which is not matched if empty.
     */
    public String getLoaderClassNameRegexp() {
        return this.LoaderClassNameRegexp;
    }

    /**
     * Set Associated class loader regular expression, which is not matched if empty.
     * @param LoaderClassNameRegexp Associated class loader regular expression, which is not matched if empty.
     */
    public void setLoaderClassNameRegexp(String LoaderClassNameRegexp) {
        this.LoaderClassNameRegexp = LoaderClassNameRegexp;
    }

    /**
     * Get Operator 
     * @return Operator Operator
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator
     * @param Operator Operator
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Whether it is a global rule. (Whether it is effective for all hosts under appid. 0: single UUID; 1: global. The default value is no.) 
     * @return IsGlobal Whether it is a global rule. (Whether it is effective for all hosts under appid. 0: single UUID; 1: global. The default value is no.)
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether it is a global rule. (Whether it is effective for all hosts under appid. 0: single UUID; 1: global. The default value is no.)
     * @param IsGlobal Whether it is a global rule. (Whether it is effective for all hosts under appid. 0: single UUID; 1: global. The default value is no.)
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get Status (0: valid, 1: deleted, 2: invalid (enabling switch off)). 
     * @return Status Status (0: valid, 1: deleted, 2: invalid (enabling switch off)).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status (0: valid, 1: deleted, 2: invalid (enabling switch off)).
     * @param Status Status (0: valid, 1: deleted, 2: invalid (enabling switch off)).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time 
     * @return ModifyTime Modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
     * @param ModifyTime Modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Whether to process historical events. 0: no, 1: yes. 
     * @return HandleHistory Whether to process historical events. 0: no, 1: yes.
     */
    public Long getHandleHistory() {
        return this.HandleHistory;
    }

    /**
     * Set Whether to process historical events. 0: no, 1: yes.
     * @param HandleHistory Whether to process historical events. 0: no, 1: yes.
     */
    public void setHandleHistory(Long HandleHistory) {
        this.HandleHistory = HandleHistory;
    }

    /**
     * Get Batch ID. 
     * @return GroupID Batch ID.
     */
    public String getGroupID() {
        return this.GroupID;
    }

    /**
     * Set Batch ID.
     * @param GroupID Batch ID.
     */
    public void setGroupID(String GroupID) {
        this.GroupID = GroupID;
    }

    /**
     * Get Number of servers covered by a rule. When IsGlobal is set to 1, all servers are displayed. 
     * @return MachinesNums Number of servers covered by a rule. When IsGlobal is set to 1, all servers are displayed.
     */
    public String getMachinesNums() {
        return this.MachinesNums;
    }

    /**
     * Set Number of servers covered by a rule. When IsGlobal is set to 1, all servers are displayed.
     * @param MachinesNums Number of servers covered by a rule. When IsGlobal is set to 1, all servers are displayed.
     */
    public void setMachinesNums(String MachinesNums) {
        this.MachinesNums = MachinesNums;
    }

    /**
     * Get Policy name 
     * @return GroupName Policy name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Policy name
     * @param GroupName Policy name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Source code regular expression, which is not matched if empty. 
     * @return CodeSourceRegexp Source code regular expression, which is not matched if empty.
     */
    public String getCodeSourceRegexp() {
        return this.CodeSourceRegexp;
    }

    /**
     * Set Source code regular expression, which is not matched if empty.
     * @param CodeSourceRegexp Source code regular expression, which is not matched if empty.
     */
    public void setCodeSourceRegexp(String CodeSourceRegexp) {
        this.CodeSourceRegexp = CodeSourceRegexp;
    }

    /**
     * Get Call stack regular expression, which is not matched if empty. 
     * @return CallStackRegexp Call stack regular expression, which is not matched if empty.
     */
    public String getCallStackRegexp() {
        return this.CallStackRegexp;
    }

    /**
     * Set Call stack regular expression, which is not matched if empty.
     * @param CallStackRegexp Call stack regular expression, which is not matched if empty.
     */
    public void setCallStackRegexp(String CallStackRegexp) {
        this.CallStackRegexp = CallStackRegexp;
    }

    /**
     * Get Whether a file exists. 0: Default value when a user does not select a rule. 1: File exists. 2: File does not exist. 
     * @return FileExist Whether a file exists. 0: Default value when a user does not select a rule. 1: File exists. 2: File does not exist.
     */
    public Long getFileExist() {
        return this.FileExist;
    }

    /**
     * Set Whether a file exists. 0: Default value when a user does not select a rule. 1: File exists. 2: File does not exist.
     * @param FileExist Whether a file exists. 0: Default value when a user does not select a rule. 1: File exists. 2: File does not exist.
     */
    public void setFileExist(Long FileExist) {
        this.FileExist = FileExist;
    }

    public MemShellRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemShellRule(MemShellRule source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.UuidHostips != null) {
            this.UuidHostips = new UuidHostip[source.UuidHostips.length];
            for (int i = 0; i < source.UuidHostips.length; i++) {
                this.UuidHostips[i] = new UuidHostip(source.UuidHostips[i]);
            }
        }
        if (source.LogicalSymbol != null) {
            this.LogicalSymbol = new Long(source.LogicalSymbol);
        }
        if (source.ClassNameRegexp != null) {
            this.ClassNameRegexp = new String(source.ClassNameRegexp);
        }
        if (source.SuperClassNameRegexp != null) {
            this.SuperClassNameRegexp = new String(source.SuperClassNameRegexp);
        }
        if (source.InterfacesRegexp != null) {
            this.InterfacesRegexp = new String(source.InterfacesRegexp);
        }
        if (source.AnnotationsRegexp != null) {
            this.AnnotationsRegexp = new String(source.AnnotationsRegexp);
        }
        if (source.LoaderClassNameRegexp != null) {
            this.LoaderClassNameRegexp = new String(source.LoaderClassNameRegexp);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.HandleHistory != null) {
            this.HandleHistory = new Long(source.HandleHistory);
        }
        if (source.GroupID != null) {
            this.GroupID = new String(source.GroupID);
        }
        if (source.MachinesNums != null) {
            this.MachinesNums = new String(source.MachinesNums);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.CodeSourceRegexp != null) {
            this.CodeSourceRegexp = new String(source.CodeSourceRegexp);
        }
        if (source.CallStackRegexp != null) {
            this.CallStackRegexp = new String(source.CallStackRegexp);
        }
        if (source.FileExist != null) {
            this.FileExist = new Long(source.FileExist);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "UuidHostips.", this.UuidHostips);
        this.setParamSimple(map, prefix + "LogicalSymbol", this.LogicalSymbol);
        this.setParamSimple(map, prefix + "ClassNameRegexp", this.ClassNameRegexp);
        this.setParamSimple(map, prefix + "SuperClassNameRegexp", this.SuperClassNameRegexp);
        this.setParamSimple(map, prefix + "InterfacesRegexp", this.InterfacesRegexp);
        this.setParamSimple(map, prefix + "AnnotationsRegexp", this.AnnotationsRegexp);
        this.setParamSimple(map, prefix + "LoaderClassNameRegexp", this.LoaderClassNameRegexp);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "HandleHistory", this.HandleHistory);
        this.setParamSimple(map, prefix + "GroupID", this.GroupID);
        this.setParamSimple(map, prefix + "MachinesNums", this.MachinesNums);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "CodeSourceRegexp", this.CodeSourceRegexp);
        this.setParamSimple(map, prefix + "CallStackRegexp", this.CallStackRegexp);
        this.setParamSimple(map, prefix + "FileExist", this.FileExist);

    }
}

