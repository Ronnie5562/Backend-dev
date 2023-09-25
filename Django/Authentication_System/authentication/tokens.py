from django.contrib.auth.tokens import PasswordResetTokenGenerator # This pkg is generraly used to reset password but in this case, I want to use it to authenticate users.
from six import text_type

class TokenGenerator(PasswordResetTokenGenerator):
    def _make_hash_value(self, user, timestamp):
        return (
            text_type(user.pk) + text_type(timestamp)
        )

generate_token = TokenGenerator()