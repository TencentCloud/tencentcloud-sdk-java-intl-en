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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventDetail extends AbstractModel {

    /**
    * <p>Login</p>
    */
    @SerializedName("Login")
    @Expose
    private LoginEvent Login;

    /**
    * <p>Registration</p>
    */
    @SerializedName("Register")
    @Expose
    private RegisterEvent Register;

    /**
    * <p>Create an order</p>
    */
    @SerializedName("CreateOrder")
    @Expose
    private CreateOrderEvent CreateOrder;

    /**
    * <p>Transaction</p>
    */
    @SerializedName("Transaction")
    @Expose
    private TransactionEvent Transaction;

    /**
    * <p>SMS</p>
    */
    @SerializedName("Sms")
    @Expose
    private SMSEvent Sms;

    /**
    * <p>Chargeback</p>
    */
    @SerializedName("ChargeBack")
    @Expose
    private ChargeBackEvent ChargeBack;

    /**
    * <p>Logout</p>
    */
    @SerializedName("Logout")
    @Expose
    private LogoutEvent Logout;

    /**
    * <p>Modify account</p>
    */
    @SerializedName("ModifyAccount")
    @Expose
    private ModifyAccountEvent ModifyAccount;

    /**
    * <p>Modify password</p>
    */
    @SerializedName("ModifyPassword")
    @Expose
    private ModifyPasswordEvent ModifyPassword;

    /**
    * <p>Security verification</p>
    */
    @SerializedName("SecurityVerification")
    @Expose
    private SecurityVerificationEvent SecurityVerification;

    /**
    * <p>Participate in promotion activities</p>
    */
    @SerializedName("AddPromotion")
    @Expose
    private AddPromotionEvent AddPromotion;

    /**
    * <p>Redeem a prize</p>
    */
    @SerializedName("Redeem")
    @Expose
    private RedeemEvent Redeem;

    /**
    * <p>Withdrawal</p>
    */
    @SerializedName("Withdraw")
    @Expose
    private WithdrawEvent Withdraw;

    /**
    * <p>Custom event</p>
    */
    @SerializedName("CustEvent")
    @Expose
    private CustEvent CustEvent;

    /**
    * <p>Scan the QR code</p>
    */
    @SerializedName("ScanCode")
    @Expose
    private ScanCodeEvent ScanCode;

    /**
    * <p>Lucky draw</p>
    */
    @SerializedName("LuckyDraw")
    @Expose
    private LuckyDrawEvent LuckyDraw;

    /**
    * <p>Perform a task</p>
    */
    @SerializedName("Task")
    @Expose
    private TaskEvent Task;

    /**
    * <p>Invitation</p>
    */
    @SerializedName("Invitation")
    @Expose
    private InvitationEvent Invitation;

    /**
    * <p>Receive a red packet</p>
    */
    @SerializedName("ClaimRedPacket")
    @Expose
    private ClaimRedPacketEvent ClaimRedPacket;

    /**
    * <p>Browse</p>
    */
    @SerializedName("Browse")
    @Expose
    private BrowseEvent Browse;

    /**
     * Get <p>Login</p> 
     * @return Login <p>Login</p>
     */
    public LoginEvent getLogin() {
        return this.Login;
    }

    /**
     * Set <p>Login</p>
     * @param Login <p>Login</p>
     */
    public void setLogin(LoginEvent Login) {
        this.Login = Login;
    }

    /**
     * Get <p>Registration</p> 
     * @return Register <p>Registration</p>
     */
    public RegisterEvent getRegister() {
        return this.Register;
    }

    /**
     * Set <p>Registration</p>
     * @param Register <p>Registration</p>
     */
    public void setRegister(RegisterEvent Register) {
        this.Register = Register;
    }

    /**
     * Get <p>Create an order</p> 
     * @return CreateOrder <p>Create an order</p>
     */
    public CreateOrderEvent getCreateOrder() {
        return this.CreateOrder;
    }

    /**
     * Set <p>Create an order</p>
     * @param CreateOrder <p>Create an order</p>
     */
    public void setCreateOrder(CreateOrderEvent CreateOrder) {
        this.CreateOrder = CreateOrder;
    }

    /**
     * Get <p>Transaction</p> 
     * @return Transaction <p>Transaction</p>
     */
    public TransactionEvent getTransaction() {
        return this.Transaction;
    }

    /**
     * Set <p>Transaction</p>
     * @param Transaction <p>Transaction</p>
     */
    public void setTransaction(TransactionEvent Transaction) {
        this.Transaction = Transaction;
    }

    /**
     * Get <p>SMS</p> 
     * @return Sms <p>SMS</p>
     */
    public SMSEvent getSms() {
        return this.Sms;
    }

    /**
     * Set <p>SMS</p>
     * @param Sms <p>SMS</p>
     */
    public void setSms(SMSEvent Sms) {
        this.Sms = Sms;
    }

    /**
     * Get <p>Chargeback</p> 
     * @return ChargeBack <p>Chargeback</p>
     */
    public ChargeBackEvent getChargeBack() {
        return this.ChargeBack;
    }

    /**
     * Set <p>Chargeback</p>
     * @param ChargeBack <p>Chargeback</p>
     */
    public void setChargeBack(ChargeBackEvent ChargeBack) {
        this.ChargeBack = ChargeBack;
    }

    /**
     * Get <p>Logout</p> 
     * @return Logout <p>Logout</p>
     */
    public LogoutEvent getLogout() {
        return this.Logout;
    }

    /**
     * Set <p>Logout</p>
     * @param Logout <p>Logout</p>
     */
    public void setLogout(LogoutEvent Logout) {
        this.Logout = Logout;
    }

    /**
     * Get <p>Modify account</p> 
     * @return ModifyAccount <p>Modify account</p>
     */
    public ModifyAccountEvent getModifyAccount() {
        return this.ModifyAccount;
    }

    /**
     * Set <p>Modify account</p>
     * @param ModifyAccount <p>Modify account</p>
     */
    public void setModifyAccount(ModifyAccountEvent ModifyAccount) {
        this.ModifyAccount = ModifyAccount;
    }

    /**
     * Get <p>Modify password</p> 
     * @return ModifyPassword <p>Modify password</p>
     */
    public ModifyPasswordEvent getModifyPassword() {
        return this.ModifyPassword;
    }

    /**
     * Set <p>Modify password</p>
     * @param ModifyPassword <p>Modify password</p>
     */
    public void setModifyPassword(ModifyPasswordEvent ModifyPassword) {
        this.ModifyPassword = ModifyPassword;
    }

    /**
     * Get <p>Security verification</p> 
     * @return SecurityVerification <p>Security verification</p>
     */
    public SecurityVerificationEvent getSecurityVerification() {
        return this.SecurityVerification;
    }

    /**
     * Set <p>Security verification</p>
     * @param SecurityVerification <p>Security verification</p>
     */
    public void setSecurityVerification(SecurityVerificationEvent SecurityVerification) {
        this.SecurityVerification = SecurityVerification;
    }

    /**
     * Get <p>Participate in promotion activities</p> 
     * @return AddPromotion <p>Participate in promotion activities</p>
     */
    public AddPromotionEvent getAddPromotion() {
        return this.AddPromotion;
    }

    /**
     * Set <p>Participate in promotion activities</p>
     * @param AddPromotion <p>Participate in promotion activities</p>
     */
    public void setAddPromotion(AddPromotionEvent AddPromotion) {
        this.AddPromotion = AddPromotion;
    }

    /**
     * Get <p>Redeem a prize</p> 
     * @return Redeem <p>Redeem a prize</p>
     */
    public RedeemEvent getRedeem() {
        return this.Redeem;
    }

    /**
     * Set <p>Redeem a prize</p>
     * @param Redeem <p>Redeem a prize</p>
     */
    public void setRedeem(RedeemEvent Redeem) {
        this.Redeem = Redeem;
    }

    /**
     * Get <p>Withdrawal</p> 
     * @return Withdraw <p>Withdrawal</p>
     */
    public WithdrawEvent getWithdraw() {
        return this.Withdraw;
    }

    /**
     * Set <p>Withdrawal</p>
     * @param Withdraw <p>Withdrawal</p>
     */
    public void setWithdraw(WithdrawEvent Withdraw) {
        this.Withdraw = Withdraw;
    }

    /**
     * Get <p>Custom event</p> 
     * @return CustEvent <p>Custom event</p>
     */
    public CustEvent getCustEvent() {
        return this.CustEvent;
    }

    /**
     * Set <p>Custom event</p>
     * @param CustEvent <p>Custom event</p>
     */
    public void setCustEvent(CustEvent CustEvent) {
        this.CustEvent = CustEvent;
    }

    /**
     * Get <p>Scan the QR code</p> 
     * @return ScanCode <p>Scan the QR code</p>
     */
    public ScanCodeEvent getScanCode() {
        return this.ScanCode;
    }

    /**
     * Set <p>Scan the QR code</p>
     * @param ScanCode <p>Scan the QR code</p>
     */
    public void setScanCode(ScanCodeEvent ScanCode) {
        this.ScanCode = ScanCode;
    }

    /**
     * Get <p>Lucky draw</p> 
     * @return LuckyDraw <p>Lucky draw</p>
     */
    public LuckyDrawEvent getLuckyDraw() {
        return this.LuckyDraw;
    }

    /**
     * Set <p>Lucky draw</p>
     * @param LuckyDraw <p>Lucky draw</p>
     */
    public void setLuckyDraw(LuckyDrawEvent LuckyDraw) {
        this.LuckyDraw = LuckyDraw;
    }

    /**
     * Get <p>Perform a task</p> 
     * @return Task <p>Perform a task</p>
     */
    public TaskEvent getTask() {
        return this.Task;
    }

    /**
     * Set <p>Perform a task</p>
     * @param Task <p>Perform a task</p>
     */
    public void setTask(TaskEvent Task) {
        this.Task = Task;
    }

    /**
     * Get <p>Invitation</p> 
     * @return Invitation <p>Invitation</p>
     */
    public InvitationEvent getInvitation() {
        return this.Invitation;
    }

    /**
     * Set <p>Invitation</p>
     * @param Invitation <p>Invitation</p>
     */
    public void setInvitation(InvitationEvent Invitation) {
        this.Invitation = Invitation;
    }

    /**
     * Get <p>Receive a red packet</p> 
     * @return ClaimRedPacket <p>Receive a red packet</p>
     */
    public ClaimRedPacketEvent getClaimRedPacket() {
        return this.ClaimRedPacket;
    }

    /**
     * Set <p>Receive a red packet</p>
     * @param ClaimRedPacket <p>Receive a red packet</p>
     */
    public void setClaimRedPacket(ClaimRedPacketEvent ClaimRedPacket) {
        this.ClaimRedPacket = ClaimRedPacket;
    }

    /**
     * Get <p>Browse</p> 
     * @return Browse <p>Browse</p>
     */
    public BrowseEvent getBrowse() {
        return this.Browse;
    }

    /**
     * Set <p>Browse</p>
     * @param Browse <p>Browse</p>
     */
    public void setBrowse(BrowseEvent Browse) {
        this.Browse = Browse;
    }

    public EventDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventDetail(EventDetail source) {
        if (source.Login != null) {
            this.Login = new LoginEvent(source.Login);
        }
        if (source.Register != null) {
            this.Register = new RegisterEvent(source.Register);
        }
        if (source.CreateOrder != null) {
            this.CreateOrder = new CreateOrderEvent(source.CreateOrder);
        }
        if (source.Transaction != null) {
            this.Transaction = new TransactionEvent(source.Transaction);
        }
        if (source.Sms != null) {
            this.Sms = new SMSEvent(source.Sms);
        }
        if (source.ChargeBack != null) {
            this.ChargeBack = new ChargeBackEvent(source.ChargeBack);
        }
        if (source.Logout != null) {
            this.Logout = new LogoutEvent(source.Logout);
        }
        if (source.ModifyAccount != null) {
            this.ModifyAccount = new ModifyAccountEvent(source.ModifyAccount);
        }
        if (source.ModifyPassword != null) {
            this.ModifyPassword = new ModifyPasswordEvent(source.ModifyPassword);
        }
        if (source.SecurityVerification != null) {
            this.SecurityVerification = new SecurityVerificationEvent(source.SecurityVerification);
        }
        if (source.AddPromotion != null) {
            this.AddPromotion = new AddPromotionEvent(source.AddPromotion);
        }
        if (source.Redeem != null) {
            this.Redeem = new RedeemEvent(source.Redeem);
        }
        if (source.Withdraw != null) {
            this.Withdraw = new WithdrawEvent(source.Withdraw);
        }
        if (source.CustEvent != null) {
            this.CustEvent = new CustEvent(source.CustEvent);
        }
        if (source.ScanCode != null) {
            this.ScanCode = new ScanCodeEvent(source.ScanCode);
        }
        if (source.LuckyDraw != null) {
            this.LuckyDraw = new LuckyDrawEvent(source.LuckyDraw);
        }
        if (source.Task != null) {
            this.Task = new TaskEvent(source.Task);
        }
        if (source.Invitation != null) {
            this.Invitation = new InvitationEvent(source.Invitation);
        }
        if (source.ClaimRedPacket != null) {
            this.ClaimRedPacket = new ClaimRedPacketEvent(source.ClaimRedPacket);
        }
        if (source.Browse != null) {
            this.Browse = new BrowseEvent(source.Browse);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Login.", this.Login);
        this.setParamObj(map, prefix + "Register.", this.Register);
        this.setParamObj(map, prefix + "CreateOrder.", this.CreateOrder);
        this.setParamObj(map, prefix + "Transaction.", this.Transaction);
        this.setParamObj(map, prefix + "Sms.", this.Sms);
        this.setParamObj(map, prefix + "ChargeBack.", this.ChargeBack);
        this.setParamObj(map, prefix + "Logout.", this.Logout);
        this.setParamObj(map, prefix + "ModifyAccount.", this.ModifyAccount);
        this.setParamObj(map, prefix + "ModifyPassword.", this.ModifyPassword);
        this.setParamObj(map, prefix + "SecurityVerification.", this.SecurityVerification);
        this.setParamObj(map, prefix + "AddPromotion.", this.AddPromotion);
        this.setParamObj(map, prefix + "Redeem.", this.Redeem);
        this.setParamObj(map, prefix + "Withdraw.", this.Withdraw);
        this.setParamObj(map, prefix + "CustEvent.", this.CustEvent);
        this.setParamObj(map, prefix + "ScanCode.", this.ScanCode);
        this.setParamObj(map, prefix + "LuckyDraw.", this.LuckyDraw);
        this.setParamObj(map, prefix + "Task.", this.Task);
        this.setParamObj(map, prefix + "Invitation.", this.Invitation);
        this.setParamObj(map, prefix + "ClaimRedPacket.", this.ClaimRedPacket);
        this.setParamObj(map, prefix + "Browse.", this.Browse);

    }
}

