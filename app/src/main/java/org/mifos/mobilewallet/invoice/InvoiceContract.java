package org.mifos.mobilewallet.invoice;

import org.mifos.mobilewallet.account.domain.model.Account;
import org.mifos.mobilewallet.core.BasePresenter;
import org.mifos.mobilewallet.core.BaseView;
import org.mifos.mobilewallet.invoice.domain.model.Invoice;
import org.mifos.mobilewallet.invoice.domain.model.PaymentMethod;

import java.util.List;

/**
 * Created by naman on 20/6/17.
 */

public interface InvoiceContract {

    interface InvoiceView extends BaseView<InvoicePresenter> {

        void showPaymentMethods(List<PaymentMethod> methods);
    }

    interface InvoicePresenter extends BasePresenter {

        void getPaymentMethods();
    }

    interface RecentInvoiceView extends BaseView<RecentInvoicePresenter> {

        void showInvoices(List<Invoice> invoices);
        void showAccounts(List<Account> accounts);
        void showError(String message);
    }

    interface RecentInvoicePresenter extends BasePresenter {

        void fetchRecentInvoices(long accountId);
        void fetchAccounts();
    }
}
